package com.mss.unified.entities;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="PosServiceConf",schema="POS")
public class PosServiceConf {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "PSC_CODE", nullable = true)
	@JsonProperty("psc_CODE")
	private int pscCode;
	
	@Column(name = "PSC_LIBELLE")
	@JsonProperty("psc_LIBELLE")
	private String pscLibelle;
	@OneToMany(mappedBy = "posServiceConf", fetch = FetchType.EAGER,
            cascade = CascadeType.ALL)
    private Set<PosTerminal> posTerminal = new HashSet<>();
    
   /* @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.DETACH,CascadeType.MERGE,
	        CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinTable(name = "POS_SERVICE_AFFECT", schema="POS",
     joinColumns = @JoinColumn(name="PSC_CODE"), 
     inverseJoinColumns = @JoinColumn(name = "POS_CODE"))
	private Set<posTerminal>posTerminal= new HashSet<>();*/
	
	/* @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.DETACH,CascadeType.MERGE,
		        CascadeType.PERSIST,CascadeType.REFRESH})
		@JoinTable(name = "POS_SERVICE_AFFECT", schema="POS",
	     joinColumns = @JoinColumn(name="PSC_CODE"), 
	     inverseJoinColumns = @JoinColumn(name = "POS_CODE"))
		private Set<PosService>posServiceLIST= new HashSet<>();*/
		
		
		@ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.DETACH,CascadeType.MERGE,
		        CascadeType.PERSIST,CascadeType.REFRESH},mappedBy = "posServiceConfLIST")
		private Set<PosService> posServiceLIST = new HashSet<PosService>();


	public int getPscCode() {
		return pscCode;
	}

	public void setPscCode(int pscCode) {
		this.pscCode = pscCode;
	}

	public String getPscLibelle() {
		return pscLibelle;
	}

	public void setPscLibelle(String pscLibelle) {
		this.pscLibelle = pscLibelle;
	}

	public Set<PosTerminal> getPosTerminal() {
		return posTerminal;
	}

	public void setPosTerminal(Set<PosTerminal> posTerminal) {
		this.posTerminal = posTerminal;
	}

	public Set<PosService> getPosServiceLIST() {
		return posServiceLIST;
	}

	public void setPosServiceLIST(Set<PosService> posServiceLIST) {
		this.posServiceLIST = posServiceLIST;
	}
}
