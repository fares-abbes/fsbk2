package com.mss.unified.entities;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.mss.unified.converter.StringListConverter;
import com.mss.unified.enumeration.ChargeBackType;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "Historique_Sendmail_ChargeBack_Inter", schema = "FRANSABANK")
public class HistoriqueSendmailChargeBackInter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "HISTORIQUE_ID", nullable = false)
    @JsonProperty("historique_ID")
    private int historiqueId;
    @Column(name = "chargeback_Id")
    private Integer chargeBackId;
    @Column(name = "chargeback_HistoryId")
    private Integer chargeBackHistoryId;

    @Enumerated(EnumType.STRING)
    private ChargeBackType historiqueType;
    @Column(name = "DATE_ENVOI_MAIL")
    private LocalDateTime dateEnvoiMail;

    private String merchantMail;

    private String agencyMail;

    private String userConnectedMail;

    @Convert(converter = StringListConverter.class)
    private List<String> ccMails;

    @Column(name = "mail_content",length = 4000)
    private String mailContent;

    @Column(name = "mail_object",length = 500)
    private String mailObject;

    // 0: in progress, 1: Sent , 2: Error , 3: partially sent ( only to agency )
    private Integer status;

    public HistoriqueSendmailChargeBackInter() {
    }

    public HistoriqueSendmailChargeBackInter(Integer chargeBackId, LocalDateTime dateEnvoiMail, Integer status,
                                        ChargeBackType chargeBackType) {
        this.chargeBackId = chargeBackId;
        this.dateEnvoiMail = dateEnvoiMail;
        this.status = status;
        this.historiqueType = chargeBackType;
    }

    public HistoriqueSendmailChargeBackInter(Integer chargeBackId, LocalDateTime dateEnvoiMail, Integer status) {
        this.chargeBackId = chargeBackId;
        this.dateEnvoiMail = dateEnvoiMail;
        this.status = status;
    }


    public int getHistoriqueId() {
        return historiqueId;
    }

    public void setHistoriqueId(int historiqueId) {
        this.historiqueId = historiqueId;
    }

    public Integer getChargeBackId() {
        return chargeBackId;
    }

    public void setChargeBackId(Integer chargeBackId) {
        this.chargeBackId = chargeBackId;
    }

    public Integer getChargeBackHistoryId() {
        return chargeBackHistoryId;
    }

    public void setChargeBackHistoryId(Integer chargeBackHistoryId) {
        this.chargeBackHistoryId = chargeBackHistoryId;
    }

    public ChargeBackType getHistoriqueType() {
        return historiqueType;
    }

    public void setHistoriqueType(ChargeBackType historiqueType) {
        this.historiqueType = historiqueType;
    }

    public LocalDateTime getDateEnvoiMail() {
        return dateEnvoiMail;
    }

    public void setDateEnvoiMail(LocalDateTime dateEnvoiMail) {
        this.dateEnvoiMail = dateEnvoiMail;
    }

    public String getMerchantMail() {
        return merchantMail;
    }

    public void setMerchantMail(String merchantMail) {
        this.merchantMail = merchantMail;
    }

    public String getAgencyMail() {
        return agencyMail;
    }

    public void setAgencyMail(String agencyMail) {
        this.agencyMail = agencyMail;
    }

    public String getMailContent() {
        return mailContent;
    }

    public void setMailContent(String mailContent) {
        this.mailContent = mailContent;
    }

    public String getMailObject() {
        return mailObject;
    }

    public void setMailObject(String mailObject) {
        this.mailObject = mailObject;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getUserConnectedMail() {
        return userConnectedMail;
    }

    public void setUserConnectedMail(String userConnectedMail) {
        this.userConnectedMail = userConnectedMail;
    }

    public List<String> getCcMails() {
        return ccMails;
    }

    public void setCcMails(List<String> ccMails) {
        this.ccMails = ccMails;
    }
}
