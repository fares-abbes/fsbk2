package com.mss.unified.entities;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="POS_ALLOWED_TRANS_CONF",schema="POS")
public class PosAllowedTransConf {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@SequenceGenerator(name = "PosAllowedTransConfSequence", sequenceName = "POS.PosAllowedTransConfSequence", allocationSize = 1)
	@JsonProperty("patc_CODE")
	private int patcCode;
	
	@Column(name = "PATC_LIBELLE")
	@JsonProperty("patc_LIBELLE")
	private String patcLibelle;
	
	@OneToMany(mappedBy = "posAllowedTransConf", fetch = FetchType.EAGER,
            cascade = CascadeType.ALL)
    private Set<PosTerminal> PosTerminal = new HashSet<>();
    
    @ManyToOne
    private PosAllowedTrans PosAllowedTrans;

	
	public int getPatcCode() {
		return patcCode;
	}

	public void setPatcCode(int pATC_CODE) {
		patcCode = pATC_CODE;
	}

	public String getPatcLibelle() {
		return patcLibelle;
	}

	public void setPatcLibelle(String pATC_LIBELLE) {
		patcLibelle = pATC_LIBELLE;
	}

	public Set<PosTerminal> getPOS_TERMINAL() {
		return PosTerminal;
	}

	public void setPOS_TERMINAL(Set<PosTerminal> pOS_TERMINAL) {
		PosTerminal = pOS_TERMINAL;
	}

	public PosAllowedTrans getPOS_ALLOWED_TRANS() {
		return PosAllowedTrans;
	}

	public void setPOS_ALLOWED_TRANS(PosAllowedTrans pOS_ALLOWED_TRANS) {
		PosAllowedTrans = pOS_ALLOWED_TRANS;
	}
    
    
}
