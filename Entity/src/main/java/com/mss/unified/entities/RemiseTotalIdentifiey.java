package com.mss.unified.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class RemiseTotalIdentifiey implements Serializable {
private String fid_h;
private String tpe_number;
public String getFid_h() {
	return fid_h;
}
public void setFid_h(String fid_h) {
	this.fid_h = fid_h;
}
public String getTpe_number() {
	return tpe_number;
}
public void setTpe_number(String tpe_number) {
	this.tpe_number = tpe_number;
}

}
