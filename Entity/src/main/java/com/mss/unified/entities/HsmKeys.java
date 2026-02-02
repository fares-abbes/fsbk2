package com.mss.unified.entities;


import javax.persistence.*;

@Entity

@Table(name = "hsmkeys",schema = "SWITCH")
public class HsmKeys {
    @EmbeddedId
    private HsmKeysId hsmKeysId;


    @Column(name = "CRYPTO", nullable = false)
    private String crypto;
    @Column(name = "KCV", nullable = false)
    private String kcv;

    public HsmKeysId getHsmKeysId() {
        return hsmKeysId;
    }

    public void setHsmKeysId(HsmKeysId hsmKeysId) {
        this.hsmKeysId = hsmKeysId;
    }

    public String getCrypto() {
        return crypto;
    }

    public void setCrypto(String crypto) {
        this.crypto = crypto;
    }

    public String getKcv() {
        return kcv;
    }

    public void setKcv(String kcv) {
        this.kcv = kcv;
    }

    public HsmKeys() {
    }
}
