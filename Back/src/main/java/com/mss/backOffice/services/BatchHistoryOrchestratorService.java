package com.mss.backOffice.services;

import com.mss.backOffice.request.AddFileRequest;
import com.mss.unified.entities.FileHeaderT;
import com.mss.unified.repositories.FileTRepository;
import com.mss.unified.repositories.CodeBankBCRepository;
import com.mss.unified.repositories.FileContentTPRepository;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@RestController
public class BatchHistoryOrchestratorService {

    @Autowired
    private FileTRepository fileSummaryTRepository;

    @Autowired
    private CodeBankBCRepository codeBankBCRepository;

    @Autowired
    private FileContentTPRepository fileContentTPRepository;

    @Autowired
    private JobLauncher jobLauncher;

    @Autowired
    private Job importFileJob;

    private final Gson gson = new Gson();

    @PutMapping("addFileTP")
    public ResponseEntity<?> addFileTP(@RequestBody AddFileRequest addFileRequest) throws IOException {
        try {
            if (!isValidDateFormat(addFileRequest.getFileDate())) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                        .body(gson.toJson("please verify that format date is YYYY-MM-dd"));
            }

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate localDate = LocalDate.parse(addFileRequest.getFileDate(), formatter);
            DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyMMdd");
            String ordinalDateString = localDate.format(outputFormatter);
            String fileName = addFileRequest.getFilePath() + "/" + addFileRequest.getFileName() + ordinalDateString + ".txt";

            if (!(fileSummaryTRepository.findByFileNameAndFileDate(addFileRequest.getFileName(), addFileRequest.getFileDate()).isPresent())) {
                FileHeaderT f = new FileHeaderT();
                f.setFileName(addFileRequest.getFileName());
                f.setFileDate(ordinalDateString);
                f.setFileprocessingDate(LocalDate.now().format(formatter));
                f.setDestinationBankIdentification(codeBankBCRepository.findAll().get(0).getIdentifiant());
                f = fileSummaryTRepository.save(f);
                int idHeader = f.getId();

                if (Files.exists(Paths.get(fileName))) {
                    // Launch Spring Batch job
                    JobParameters params = new JobParametersBuilder()
                            .addString("filePath", fileName)
                            .addString("idHeader", String.valueOf(idHeader))
                            .addLong("time", System.currentTimeMillis())
                            .toJobParameters();
                    jobLauncher.run(importFileJob, params);

                    // Get size
                    long size = fileContentTPRepository.count();

                    return ResponseEntity.ok().body(gson.toJson(size));
                } else {
                    return ResponseEntity.badRequest().body(gson.toJson("file not found"));
                }
            } else {
                return ResponseEntity.badRequest().body(gson.toJson("file already processed"));
            }
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body(gson.toJson("Errors while processing file"));
        }
    }

    private boolean isValidDateFormat(String date) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate.parse(date, formatter);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
