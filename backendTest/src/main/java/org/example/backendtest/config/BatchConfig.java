package org.example.backendtest.config;

import org.example.backendtest.dto.TpRecord;
import org.example.backendtest.repository.TpRecordRepository;
import org.example.backendtest.service.TpParseService;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;

@Configuration
public class BatchConfig {

    @Autowired
    private JobBuilderFactory jobBuilderFactory;

    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Autowired
    private TpParseService tpParseService;

    @Autowired
    private TpRecordRepository tpRecordRepository;

    @Bean
    @StepScope
    public FlatFileItemReader<String> reader(@Value("#{jobParameters['filePath']}") String filePath) {
        FlatFileItemReader<String> reader = new FlatFileItemReader<>();
        reader.setResource(new FileSystemResource(filePath));
        reader.setEncoding("ISO-8859-1");
        reader.setLinesToSkip(0); // assuming no header

        DefaultLineMapper<String> lineMapper = new DefaultLineMapper<>();
        lineMapper.setLineTokenizer(new DelimitedLineTokenizer() {{
            setDelimiter("\n"); // treat whole line as one field
            setNames("line");
        }});
        lineMapper.setFieldSetMapper(new FieldSetMapper<String>() {
            @Override
            public String mapFieldSet(FieldSet fieldSet) throws org.springframework.validation.BindException {
                return fieldSet.readString("line");
            }
        });
        reader.setLineMapper(lineMapper);

        return reader;
    }

    @Bean
    @StepScope
    public ItemProcessor<String, TpRecord> processor() {
        return line -> {
            TpRecord record = new TpRecord();
            // Use the safeSub logic to parse
            record.setCodeDebit(safeSub(line, 0, 1).trim());
            record.setCodeBin(safeSub(line, 1, 7).trim());
            record.setCodeBank(safeSub(line, 7, 10).trim());
            record.setNumRIBEmetteur(safeSub(line, 10, 30).trim());
            record.setNumCartePorteur(safeSub(line, 30, 49).trim());
            record.setCodeDebitCommercant(safeSub(line, 49, 50).trim());
            record.setNumRIBcommercant(safeSub(line, 50, 70).trim());
            record.setBinAcquereur(safeSub(line, 70, 76).trim());
            record.setCodeBankAcquereur(safeSub(line, 76, 79).trim());
            record.setCodeAgence(safeSub(line, 79, 84).trim());
            record.setIdTerminal(safeSub(line, 84, 99).trim());
            record.setIdCommercant(safeSub(line, 99, 114).trim());
            record.setTypeTransaction(safeSub(line, 114, 117).trim());
            record.setDateTransaction(safeSub(line, 117, 125).trim());
            record.setHeureTransaction(safeSub(line, 125, 131).trim());
            record.setMontantTransaction(safeSub(line, 131, 146).trim());
            record.setNumFacture(safeSub(line, 146, 161).trim());
            record.setEmetteurFacture(safeSub(line, 161, 201).trim());
            record.setNumRefTransaction(safeSub(line, 201, 213).trim());
            record.setNumAutorisation(safeSub(line, 213, 228).trim());
            record.setCodeDebitPorteur(safeSub(line, 228, 229).trim());
            record.setCommisionPorteur(safeSub(line, 229, 241).trim());
            record.setCodeDebitCommisionCommercant(safeSub(line, 241, 242).trim());
            record.setCommisionCommercant(safeSub(line, 242, 254).trim());
            record.setCommisionInterchange(safeSub(line, 254, 266).trim());
            record.setFraisOperateurTechnique(safeSub(line, 266, 278).trim());
            record.setAppCryptogram(safeSub(line, 278, 294).trim());
            record.setCryptogramInfoData(safeSub(line, 294, 296).trim());
            record.setAtc(safeSub(line, 296, 300).trim());
            record.setTerminalVerificationResult(safeSub(line, 300, 310).trim());
            record.setLibelleCommercant(safeSub(line, 310, 350).trim());
            record.setModeLectureCarte(safeSub(line, 350, 351).trim());
            record.setMethodeVerificationPorteur(safeSub(line, 351, 352).trim());
            record.setTypeDispositifSansContract(safeSub(line, 352, 353).trim());
            record.setCommissionsGestionaireATM(safeSub(line, 353, 365).trim());
            record.setIdChargeback(safeSub(line, 365, 381).trim());
            record.setCodeMotifChargeback(safeSub(line, 381, 385).trim());
            record.setNumAutorisationInitial(safeSub(line, 385, 400).trim());
            record.setDateOPInitial(safeSub(line, 400, 408).trim());
            record.setNumtransaction(safeSub(line, 408, 420).trim());
            record.setUdf1(safeSub(line, 420, 440).trim());
            record.setRufAcquereur(safeSub(line, 440, 458).trim());
            if ("040".equals(record.getTypeTransaction())) {
                record.setLocalisationATM(safeSub(line, 458, 478).trim());
                record.setReseau(safeSub(line, 458, 478).trim());
                record.setTrackId(safeSub(line, 458, 478).trim());
                record.setRufRetrait(safeSub(line, 458, 478).trim());
            } else {
                record.setNumTransactionPaiementInternet(safeSub(line, 458, 478).trim());
                record.setTrackId(safeSub(line, 478, 488).trim());
                record.setIdOriginTransaction(safeSub(line, 488, 508).trim());
                record.setRufpaiement(safeSub(line, 508, 526).trim());
            }
            record.setStatus("pending");
            return record;
        };
    }

    @Bean
    @StepScope
    public ItemWriter<TpRecord> writer(@Value("#{jobParameters['jobId']}") String jobId) {
        return items -> {
            for (TpRecord item : items) {
                item.setBatchId(jobId);
            }
            tpRecordRepository.saveAll(items);
            for (TpRecord item : items) {
                tpParseService.addRecord(jobId, item);
            }
        };
    }

    @Bean
    public Step tpParseStep() {
        return stepBuilderFactory.get("tpParseStep")
                .<String, TpRecord>chunk(10)
                .reader(reader(null))
                .processor(processor())
                .writer(writer(null))
                .build();
    }

    @Bean
    public Job tpParseJob() {
        return jobBuilderFactory.get("tpParseJob")
                .start(tpParseStep())
                .build();
    }

    private String safeSub(String s, int start, int end) {
        if (start >= s.length()) return "";
        if (end > s.length()) end = s.length();
        if (start < 0 || start > end) return "";
        return s.substring(start, end);
    }
}