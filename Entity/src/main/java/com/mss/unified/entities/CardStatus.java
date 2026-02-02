package com.mss.unified.entities;


import javax.persistence.*;

@Entity
@Table(name = "CARD_STATUS",schema = "PORTEUR")
public class CardStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "StatusSequence")
    @SequenceGenerator(name = "StatusSequence", sequenceName = "PORTEUR.StatusSequence", allocationSize = 1)
    @Column(name = "CODE_status", nullable = false)
    private int cardStatusCode;

    @Column(name = "SCT_LIBELLE")
    private String status;
    

    private String statusFr;


    public String getStatusFr() {
		return statusFr;
	}

	public void setStatusFr(String statusFr) {
		this.statusFr = statusFr;
	}

	public int getCardStatusCode() {
        return cardStatusCode;
    }

    public void setCardStatusCode(int cardStatusCode) {
        this.cardStatusCode = cardStatusCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
