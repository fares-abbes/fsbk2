package com.mss.unified.entities;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="PosLimitsConf",schema="POS")
public class PosLimitsConf {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@JsonProperty("plc_CODE")
	private int plcCode;
	
	@JsonProperty("plc_LIBELLE")
	private String plcLibelle;
	
	@OneToMany(mappedBy = "posLimitsConf", fetch = FetchType.EAGER,
            cascade = CascadeType.ALL)
    private Set<PosTerminal> posTerminal = new HashSet<>();
    
    @ManyToOne
    private PosLimits posLimits;

	public int getPlcCode() {
		return plcCode;
	}

	public void setPlcCode(int plcCode) {
		this.plcCode = plcCode;
	}

	public String getPlcLibelle() {
		return plcLibelle;
	}

	public void setPlcLibelle(String plcLibelle) {
		this.plcLibelle = plcLibelle;
	}

	public Set<PosTerminal> getPosTerminal() {
		return posTerminal;
	}

	public void setPosTerminal(Set<PosTerminal> posTerminal) {
		this.posTerminal = posTerminal;
	}

	public PosLimits getPosLimits() {
		return posLimits;
	}

	public void setPosLimits(PosLimits posLimits) {
		this.posLimits = posLimits;
	}
}
