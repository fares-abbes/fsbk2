package com.mss.unified.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "ATM_TERMINAL",schema = "ATM")
public class AtmTerminal {

    @Id
    @Column(name = "ATE_ID", nullable = false)
    private String ateId;

    @Column(name = "MCC_CODE", nullable = false)
    private int mccCode;

    @Column(name = "MERCHANT_CODE", nullable = false)
    private int merchantCode;

    @Column(name = "TERSTAT_CODE", nullable = false)
    private int terstatCode;

    @Column(name = "ATM_CON_NUM", nullable = false)
    private int atmConNum;

    @Column(name = "ATE_LIBELLE")
    private String ateLibelle;

    @Column(name = "ZMK_KEY")
    private String zmkKey;

    @Column(name = "TMK_KEY")
    private String tmkKey;

    @Column(name = "TPK_KEY")
    private String TPK_KEY;

    @Column(name = "ADRESSE_IP")
    private String ipAdresse;

    @Column(name = "PORT")
    private String portCon;

    @Column(name = "ETAT_TERMINAL")
    private String etatTerminal;

    @Column(name = "CAPTURED_CARD_NUMBER")
    private String capturedCardNumber;

    @Column(name = "ENVELOPES_DEPOSITED")
    private String envelopesDeposited;

    @Column(name = "TSN")
    private String atmTerminalTsn;

     

    @Column(name = "ZMK_KCV")
    private String zmkKcv;

    

    @Column(name = "TMK_KCV")
    private String tmkKcv;

    

    @Column(name = "TPK_KCV")
    private String tpk_kcv;

     

    @Column(name = "MODEL")
    private Integer model;
    @Column(name = "MARQUE")
    private Integer marque;
    @Column(name ="ACTUAl_STATE")
    private String actualState;
    @Column(name ="STATUS")
    private String status;

    @Column(name ="COUNTER")
    private Integer counter;
    
    
    public String getIpAdresse() {
		return ipAdresse;
	}

	public void setIpAdresse(String ipAdresse) {
		this.ipAdresse = ipAdresse;
	}

	public String getPortCon() {
		return portCon;
	}

	public void setPortCon(String portCon) {
		this.portCon = portCon;
	}

	public String getZmkKcv() {
		return zmkKcv;
	}

	public void setZmkKcv(String zmkKcv) {
		this.zmkKcv = zmkKcv;
	}

	public String getTmkKcv() {
		return tmkKcv;
	}

	public void setTmkKcv(String tmkKcv) {
		this.tmkKcv = tmkKcv;
	}

	public String getTpk_kcv() {
		return tpk_kcv;
	}

	public void setTpk_kcv(String tpk_kcv) {
		this.tpk_kcv = tpk_kcv;
	}

	public Integer getModel() {
		return model;
	}

	public void setModel(Integer model) {
		this.model = model;
	}

	public Integer getMarque() {
		return marque;
	}

	public void setMarque(Integer marque) {
		this.marque = marque;
	}

	public String getAtmTerminalTsn() {
        return atmTerminalTsn;
    }

    public void setAtmTerminalTsn(String atmTerminalTsn) {
        this.atmTerminalTsn = atmTerminalTsn;
    }

    public String getAteId() {
        return ateId;
    }

    public void setAteId(String ateId) {
        this.ateId = ateId;
    }

    public int getMccCode() {
        return mccCode;
    }

    public void setMccCode(int mccCode) {
        this.mccCode = mccCode;
    }

    public int getMerchantCode() {
        return merchantCode;
    }

    public void setMerchantCode(int merchantCode) {
        this.merchantCode = merchantCode;
    }

    public int getTerstatCode() {
        return terstatCode;
    }

    public void setTerstatCode(int terstatCode) {
        this.terstatCode = terstatCode;
    }

    public int getAtmConNum() {
        return atmConNum;
    }

    public void setAtmConNum(int atmConNum) {
        this.atmConNum = atmConNum;
    }

    public String getAteLibelle() {
        return ateLibelle;
    }

    public void setAteLibelle(String ateLibelle) {
        this.ateLibelle = ateLibelle;
    }

    public String getZmkKey() {
        return zmkKey;
    }

    public void setZmkKey(String zmkKey) {
        this.zmkKey = zmkKey;
    }

    public String getTmkKey() {
        return tmkKey;
    }

    public void setTmkKey(String tmkKey) {
        this.tmkKey = tmkKey;
    }

    public String getTPK_KEY() {
        return TPK_KEY;
    }

    public void setTPK_KEY(String tPK_KEY) {
        TPK_KEY = tPK_KEY;
    }

    public String getIdAddress() {
        return ipAdresse;
    }

    public void setIdAddress(String idAddress) {
        this.ipAdresse = idAddress;
    }

    public String getPORT() {
        return portCon;
    }

    public void setPORT(String pORT) {
        portCon = pORT;
    }

    public String getEtatTerminal() {
        return etatTerminal;
    }

    public void setEtatTerminal(String etatTerminal) {
        this.etatTerminal = etatTerminal;
    }

    public String getCapturedCardNumber() {
        return capturedCardNumber;
    }

    public void setCapturedCardNumber(String capturedCardNumber) {
        this.capturedCardNumber = capturedCardNumber;
    }

    public String getEnvelopesDeposited() {
        return envelopesDeposited;
    }

    public void setEnvelopesDeposited(String envelopesDeposited) {
        this.envelopesDeposited = envelopesDeposited;
    }

    public String getActualState() {
        return actualState;
    }

    public void setActualState(String actualState) {
        this.actualState = actualState;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getCounter() {
        return counter;
    }

    public void setCounter(Integer counter) {
        this.counter = counter;
    }

    @Override
    public String toString() {
        return "AtmTerminal{" +
                "ateId='" + ateId + '\'' +
                ", mccCode=" + mccCode +
                ", merchantCode=" + merchantCode +
                ", terstatCode=" + terstatCode +
                ", atmConNum=" + atmConNum +
                ", ateLibelle='" + ateLibelle + '\'' +
                ", zmkKey='" + zmkKey + '\'' +
                ", tmkKey='" + tmkKey + '\'' +
                ", TPK_KEY='" + TPK_KEY + '\'' +
                ", ipAdresse='" + ipAdresse + '\'' +
                ", portCon='" + portCon + '\'' +
                ", etatTerminal='" + etatTerminal + '\'' +
                ", capturedCardNumber='" + capturedCardNumber + '\'' +
                ", envelopesDeposited='" + envelopesDeposited + '\'' +
                ", atmTerminalTsn='" + atmTerminalTsn + '\'' +
                ", zmkKcv='" + zmkKcv + '\'' +
                ", tmkKcv='" + tmkKcv + '\'' +
                ", tpk_kcv='" + tpk_kcv + '\'' +
                ", model=" + model +
                ", marque=" + marque +
                ", actualState='" + actualState + '\'' +
                ", status='" + status + '\'' +
                ", counter=" + counter +
                '}';
    }
}
