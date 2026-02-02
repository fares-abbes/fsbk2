package com.mss.unified.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "OPPOSED_CARD",schema = "PORTEUR")
public
class OpposedCard {
   
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "OpposedClientCardSequence")
	@SequenceGenerator(name = "OpposedClientCardSequence", sequenceName = "PORTEUR.OpposedClientCardSequence", allocationSize = 1)
    @Column(name = "CAR_OPP_CODE", nullable = false)
    
    private int oppCardCode;
    
    
    private Integer cardCode;
    
    @Column(name = "CARD_NUMBER", nullable = false)
    private String cardNumber;

    @Column(name = "MOTIF_OPPOSITION", nullable = false)
    private String motifOpposition;
    
    private String motifOppositionFr;

    @Column(name = "DATE_APPOSTION", nullable = false)
    private Date dateOpposition;
    
    @Column(name = "EDITED_BY")
    private String editedBy;
    
    private String branch;
    
    

    public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getMotifOppositionFr() {
		return motifOppositionFr;
	}

	public void setMotifOppositionFr(String motifOppositionFr) {
		this.motifOppositionFr = motifOppositionFr;
	}

	public Integer getCardCode() {
		return cardCode;
	}

	public void setCardCode(Integer cardCode) {
		this.cardCode = cardCode;
	}

	public String getEditedBy() {
		return editedBy;
	}

	public void setEditedBy(String editedBy) {
		this.editedBy = editedBy;
	}

	public
    int getOppCardCode() {
        return oppCardCode;
    }

    public
    void setOppCardCode(int oppCardCode) {
        this.oppCardCode = oppCardCode;
    }

    public
    String getCardNumber() {
        return cardNumber;
    }

    public
    void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public
    String getMotifOpposition() {
        return motifOpposition;
    }

    public
    void setMotifOpposition(String motifOpposition) {
        this.motifOpposition = motifOpposition;
    }

    public
    Date getDateOpposition() {
        return dateOpposition;
    }

    public
    void setDateOpposition(Date dateOpposition) {
        this.dateOpposition = dateOpposition;
    }
}
