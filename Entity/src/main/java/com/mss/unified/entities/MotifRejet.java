package com.mss.unified.entities;

import javax.persistence.*;

@Entity
@Table(name = "MotifRejet", schema = "FRANSABANK")
public class MotifRejet {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "newMotifRejetSequence")
	@SequenceGenerator(name = "newMotifRejetSequence", sequenceName = "FRANSABANK.MotifRejetSequencens", allocationSize = 1)
	@Column(name = "id", nullable = false)
	private int id;

	private String code;
	private String description;
	@Column(name = "delais", nullable = true,columnDefinition = "int default 0")
	private int delais;

	public int getDelais() {
		return delais;
	}

	public void setDelais(int delais) {
		this.delais = delais;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
