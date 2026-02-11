package org.example.backendtest.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.example.backendtest.dto.TpRecord;
import org.example.backendtest.service.TpParseService;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/api/fileparse")
public class FileParseController {

    @Autowired
    private JobLauncher jobLauncher;

    @Autowired
    private Job tpParseJob;

    @Autowired
    private TpParseService tpParseService;

    @PostMapping("/parseTP")
    @Operation(summary = "Parse TP file", description = "Parse a TP file from a given file path using Spring Batch")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Successfully parsed the file"),
        @ApiResponse(responseCode = "400", description = "Bad request - file path is empty or invalid"),
        @ApiResponse(responseCode = "500", description = "Internal server error - batch job failed")
    })
    public ResponseEntity<?> parseTPFile(@RequestParam("filePath") String filePath) throws Exception {
        if (filePath == null || filePath.trim().isEmpty()) {
            return ResponseEntity.badRequest().body("File path is empty");
        }

        File file = new File(filePath);
        if (!file.exists() || !file.isFile()) {
            return ResponseEntity.badRequest().body("File does not exist or is not a valid file");
        }

        String jobId = UUID.randomUUID().toString();
        JobParameters params = new JobParametersBuilder()
                .addString("filePath", filePath)
                .addString("jobId", jobId)
                .addLong("time", System.currentTimeMillis())
                .toJobParameters();

        JobExecution execution = jobLauncher.run(tpParseJob, params);

        // Wait for completion
        while (execution.isRunning()) {
            Thread.sleep(100);
        }

        if (execution.getStatus().isUnsuccessful()) {
            return ResponseEntity.status(500).body("Batch job failed: " + execution.getStatus());
        }

        List<TpRecord> results = tpParseService.getResults(jobId);
        tpParseService.clearResults(jobId);

        return ResponseEntity.ok(new java.util.HashMap<String, Object>() {{
            put("count", results.size());
            put("message", "File parsed successfully. Full data available in service.");
        }});
    }
}