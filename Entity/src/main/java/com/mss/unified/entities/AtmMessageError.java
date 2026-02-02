package com.mss.unified.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ATM_MESSAGE_ERROR",schema = "ATM")
public class AtmMessageError {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "AME_CODE", nullable = false)
    private int atmMessageCode;

    @Column(name = "ATE_ID", nullable = false)
    private String AtmTerminalId;

    @Column(name = "AME_DATE", nullable = false)
    private Date AtmMessageDate;

    @Column(name = "MESSAGE_ERROR", nullable = false)
    private String AtmMessageValue;

    public int getAtmMessageCode() {
        return atmMessageCode;
    }

    public void setAtmMessageCode(int atmMessageCode) {
        this.atmMessageCode = atmMessageCode;
    }

    public String getAtmTerminalId() {
        return AtmTerminalId;
    }

    public void setAtmTerminalId(String atmTerminalId) {
        AtmTerminalId = atmTerminalId;
    }

    public Date getAtmMessageDate() {
        return AtmMessageDate;
    }

    public void setAtmMessageDate(Date atmMessageDate) {
        AtmMessageDate = atmMessageDate;
    }

    public String getAtmMessageValue() {
        return AtmMessageValue;
    }

    public void setAtmMessageValue(String atmMessageValue) {
        AtmMessageValue = atmMessageValue;
    }
}
