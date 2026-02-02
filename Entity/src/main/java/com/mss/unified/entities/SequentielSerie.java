package com.mss.unified.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "Sequentiel_Serie", schema = "POS")
public class SequentielSerie {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "SequentielSerieSequence")
	@SequenceGenerator(name = "SequentielSerieSequence", sequenceName = "POS.SequentielSerieSequence", allocationSize = 1)
	@Column(name = "Sequence_Serie")
	private int sequenceSer;
	
	private String dateG;
	
	

	public String getDateG() {
		return dateG;
	}

	public void setDateG(String dateG) {
		this.dateG = dateG;
	}

	public int getSequenceSer() {
		return sequenceSer;
	}

	public void setSequenceSer(int sequenceSer) {
		this.sequenceSer = sequenceSer;
	}

	@Override
	public String toString() {
		return "SequentielSerie [sequenceSer=" + sequenceSer + ", dateG=" + dateG + "]";
	}
	
	
}
