package com.mss.unified.entities;

import javax.persistence.*;

@Entity
@Table(name = "POS_ENTRY_MODE_TYPES", schema = "PORTEUR")
public class PosEntryModeTypes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "ProgramSequence")
    @SequenceGenerator(name = "ProgramSequence", sequenceName = "PORTEUR.ProgramSequence", allocationSize = 1)
    @Column(name = "CODE", nullable = false)

    public Integer posEntryModeCode;

    @Column(name = "Type")
    public String type;
    
    private Integer positionValue;


    public Integer getPositionValue() {
		return positionValue;
	}

	public void setPositionValue(Integer positionValue) {
		this.positionValue = positionValue;
	}

	public Integer getPosEntryModeCode() {
        return posEntryModeCode;
    }

    public void setPosEntryModeCode(Integer posEntryModeCode) {
        this.posEntryModeCode = posEntryModeCode;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
