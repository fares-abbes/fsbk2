package com.mss.unified.entities;

import javax.persistence.*;

@Entity
@Table(name = "CodeBankBC", schema = "FRANSABANK")
public class CodeBankBC {
    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "newCodeBankBCSequence")
    @SequenceGenerator(name = "newCodeBankBCSequence", sequenceName = "FRANSABANK.CodeBankBCSequencens", allocationSize = 1)
    @Column(name = "CODE", nullable = false)
    private int code;
    @Column(name = "IDENTIFIANT")
    private String identifiant;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }
}
