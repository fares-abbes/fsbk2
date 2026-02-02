package com.mss.unified.entities;

import javax.persistence.*;

@Entity
@Table(name = "Status_File_Content", schema = "FRANSABANK")
public class StatusFileContent {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "newStatus_File_Contentseg")
	@SequenceGenerator(name = "newStatus_File_Contentseg", sequenceName = "FRANSABANK.Status_File_Contentsegns", allocationSize = 1)
	@Column(name = "ID", nullable = false)
	private int id;

	private String code;
	private String label;
	private String rgbColor;

	public String getRgbColor() {
		return rgbColor;
	}

	public void setRgbColor(String rgbColor) {
		this.rgbColor = rgbColor;
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

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	@Override
	public String toString() {
		return "StatusFileContent [id=" + id + ", code=" + code + ", label=" + label + "]";
	}

}
