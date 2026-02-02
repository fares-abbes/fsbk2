package com.mss.unified.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "FileUsed", schema = "FRANSABANK")
public class FileUsed {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int code;


	@Column(name = "file_integration")
	private String fileIntegration;
 
	private String typeFile;
	private String fileName;
	private Long nblignes;
	private String modifiedDate;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getFileIntegration() {
		return fileIntegration;
	}
	public void setFileIntegration(String fileIntegration) {
		this.fileIntegration = fileIntegration;
	}
 
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public Long getNblignes() {
		return nblignes;
	}
	public void setNblignes(Long nblignes) {
		this.nblignes = nblignes;
	}
	public String getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public String getTypeFile() {
		return typeFile;
	}
	public void setTypeFile(String typeFile) {
		this.typeFile = typeFile;
	}
	@Override
	public String toString() {
		return "FileUsed [code=" + code + ", fileIntegration=" + fileIntegration + ", typeFile=" + typeFile
				+ ", fileName=" + fileName + ", nblignes=" + nblignes + ", modifiedDate=" + modifiedDate + "]";
	}
 
}
