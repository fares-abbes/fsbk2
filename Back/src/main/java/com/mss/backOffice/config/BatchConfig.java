package com.mss.backOffice.config;

import com.mss.unified.entities.Account;
import com.mss.unified.entities.BatchesHistory;
import com.mss.unified.entities.Card;
import com.mss.unified.entities.FileContentTP;
import com.mss.unified.repositories.CardRepository;
import com.mss.unified.repositories.AccountRepository;
import com.mss.unified.repositories.FileContentTPRepository;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
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

import java.util.Optional;

@Configuration
@EnableBatchProcessing
public class BatchConfig {

    @Autowired
    private JobBuilderFactory jobBuilderFactory;

    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Autowired
    private FileContentTPRepository fileContentTPRepository;

    @Autowired
    private CardRepository cardRepository;

    @Autowired
    private AccountRepository accountRepository;

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
    public ItemProcessor<String, FileContentTP> processor(@Value("#{jobParameters['idHeader']}") String idHeader) {
        return line -> {
            FileContentTP fileContent = new FileContentTP();
            // parse line
            fileContent.setCodeDebit(safeSub(line, 0, 1).trim());
            fileContent.setCodeBin(safeSub(line, 1, 7).trim());
            fileContent.setCodeBank(safeSub(line, 7, 10).trim());
            fileContent.setNumRIBEmetteur(safeSub(line, 10, 30).trim());
            fileContent.setNumCartePorteur(safeSub(line, 30, 49).trim());
            fileContent.setCodeDebitCommercant(safeSub(line, 49, 50).trim());
            fileContent.setNumRIBcommercant(safeSub(line, 50, 70).trim());
            fileContent.setBinAcquereur(safeSub(line, 70, 76).trim());
            fileContent.setCodeBankAcquereur(safeSub(line, 76, 79).trim());
            fileContent.setCodeAgence(safeSub(line, 79, 84).trim());
            fileContent.setIdTerminal(safeSub(line, 84, 99).trim());
            fileContent.setIdCommercant(safeSub(line, 99, 114).trim());
            fileContent.setTypeTransaction(safeSub(line, 114, 117).trim());
            fileContent.setDateTransaction(safeSub(line, 117, 125).trim());
            fileContent.setHeureTransaction(safeSub(line, 125, 131).trim());
            fileContent.setMontantTransaction(safeSub(line, 131, 146).trim());
            fileContent.setNumFacture(safeSub(line, 146, 161).trim());
            fileContent.setEmetteurFacture(safeSub(line, 161, 201).trim());
            fileContent.setNumRefTransaction(safeSub(line, 201, 213).trim());
            fileContent.setNumAutorisation(safeSub(line, 213, 228).trim());
            fileContent.setCodeDebitPorteur(safeSub(line, 228, 229).trim());
            fileContent.setCommisionPorteur(safeSub(line, 229, 241).trim());
            fileContent.setCodeDebitCommisionCommercant(safeSub(line, 241, 242).trim());
            fileContent.setCommisionCommercant(safeSub(line, 242, 254).trim());
            fileContent.setCommisionInterchange(safeSub(line, 254, 266).trim());
            fileContent.setFraisOperateurTechnique(safeSub(line, 266, 278).trim());
            fileContent.setAppCryptogram(safeSub(line, 278, 294).trim());
            fileContent.setCryptogramInfoData(safeSub(line, 294, 296).trim());
            fileContent.setAtc(safeSub(line, 296, 300).trim());
            fileContent.setTerminalVerificationResult(safeSub(line, 300, 310).trim());
            fileContent.setLibelleCommercant(safeSub(line, 310, 350).trim());
            fileContent.setModeLectureCarte(safeSub(line, 350, 351).trim());
            fileContent.setMethodeVerificationPorteur(safeSub(line, 351, 352).trim());
            fileContent.setTypeDispositifSansContract(safeSub(line, 352, 353).trim());
            fileContent.setcommissionsGestionaireATM(safeSub(line, 353, 365).trim());
            fileContent.setIdChargeback(safeSub(line, 365, 381).trim());
            fileContent.setCodeMotifChargeback(safeSub(line, 381, 385).trim());
            fileContent.setNumAutorisationInitial(safeSub(line, 385, 400).trim());
            fileContent.setdateOPInitial(safeSub(line, 400, 408).trim());
            fileContent.setNumtransaction(safeSub(line, 408, 420).trim());
            fileContent.setUdf1(safeSub(line, 420, 440).trim());
            fileContent.setRufAcquereur(safeSub(line, 440, 458).trim());

            // special logic
            if (fileContent.getCodeBank().equals("035")) {
                Optional<Card> card = cardRepository.findByCardNum(fileContent.getNumCartePorteur());
                if (card.isPresent()) {
                    Optional<Account> account = accountRepository.findByAccountCode(card.get().getAccCode());
                    if (account.isPresent()) {
                        fileContent.setNumRIBEmetteur("0" + account.get().getAccountNum());
                    }
                }
            }

            // conditional
            if (fileContent.getTypeTransaction().equals("040")) {
                String val = safeSub(line, 458, 478);
                fileContent.setLocalisationATM(val);
                fileContent.setReseau(val);
                fileContent.setTrackId(val);
                fileContent.setRufRetrait(val);
            } else {
                fileContent.setNumTransactionPaiementInternet(safeSub(line, 458, 478));
                fileContent.setTrackId(safeSub(line, 478, 488));
                fileContent.setIdOriginTransaction(safeSub(line, 488, 508));
                fileContent.setRufpaiement(safeSub(line, 508, 526).trim());
            }

            fileContent.setStatus("NEW"); // or whatever status

            // Set the batch history
            BatchesHistory batchHistory = new BatchesHistory();
            batchHistory.setBatchHId(Long.valueOf(idHeader));
            fileContent.setBatchHistory(batchHistory);

            return fileContent;
        };
    }

    private String safeSub(String s, int start, int end) {
        if (start >= s.length()) return "";
        return s.substring(start, Math.min(end, s.length()));
    }

    @Bean
    @StepScope
    public ItemWriter<FileContentTP> writer(@Value("#{jobParameters['idHeader']}") String idHeader) {
        return items -> {
            for (FileContentTP item : items) {
                // idHeder is already set in processor
            }
            fileContentTPRepository.saveAll(items);
        };
    }

    @Bean
    public Step step1(ItemReader<String> reader, ItemProcessor<String, FileContentTP> processor, ItemWriter<FileContentTP> writer) {
        return stepBuilderFactory.get("step1")
                .<String, FileContentTP>chunk(10)
                .reader(reader)
                .processor(processor)
                .writer(writer)
                .build();
    }

    @Bean
    public Job importFileJob(Step step1) {
        return jobBuilderFactory.get("importFileJob")
                .incrementer(new RunIdIncrementer())
                .start(step1)
                .build();
    }
}