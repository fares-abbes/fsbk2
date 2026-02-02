package com.mss.unified.entities;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BANK", schema = "FRANSABANK")
public class BankFransaBank {

    @Id
    @Column(name = "CODE")
    private String code;

    @Column(name = "LIBELLE")
    private String libelle;
    
    @Column(name = "STATUS")
    private String status;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "BankFransaBank [code=" + code + ", libelle=" + libelle + ", status=" + status + "]";
	}


    
}
