package com.mss.unified.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Sequentiel_Serie_BS", schema = "POS")
public class SequentielSerieBS {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "SequentielSerieBSSequence")
	@SequenceGenerator(name = "SequentielSerieBSSequence", sequenceName = "POS.SequentielSerieBSSequence", allocationSize = 1)
	@Column(name = "Sequence_Serie")
	private int sequenceSer;
	
	private String dateG;
	
	private int sequence;
	
	

	public int getSequence() {
		return sequence;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

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
		return "SequentielSerieBS [sequenceSer=" + sequenceSer + ", dateG=" + dateG + "]";
	}
	
	
}
