package com.mss.unified.entities;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="PosBinConf",schema="POS")
public class PosBinConf {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "PosBinConfSequence")
	@SequenceGenerator(name = "PosBinConfSequence", sequenceName = "POS.PosBinConfSequence", allocationSize = 1)
	@Column(name = "PBC_CODE", nullable = false)
	@JsonProperty("pbc_CODE")
	private int pbcCode;
	
	@Column(name = "PBC_LIBELLE")
	@JsonProperty("pbc_LIBELLE")
	private String pbcLibelle;
	
	@ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.ALL},mappedBy = "posBinConfsList")
    @OnDelete(action = OnDeleteAction.CASCADE)
	private Set<PosBin> posbinList = new HashSet<PosBin>();
	
	@OneToMany(mappedBy = "pbcBinConf", fetch = FetchType.EAGER,
            cascade = CascadeType.ALL)
    private Set<PosTerminal> posTerminal = new HashSet<>();

	public int getPbcCode() {
		return pbcCode;
	}

	public void setPbcCode(int pbcCode) {
		this.pbcCode = pbcCode;
	}

	public String getPbcLibelle() {
		return pbcLibelle;
	}

	public void setPbcLibelle(String pbcLibelle) {
		this.pbcLibelle = pbcLibelle;
	}

	public Set<PosBin> getPosbinList() {
		return posbinList;
	}

	public void setPosbinList(Set<PosBin> posbinList) {
		this.posbinList = posbinList;
	}

	public Set<com.mss.unified.entities.PosTerminal> getPosTerminal() {
		return posTerminal;
	}

	public void setPosTerminal(Set<com.mss.unified.entities.PosTerminal> posTerminal) {
		this.posTerminal = posTerminal;
	}
}
