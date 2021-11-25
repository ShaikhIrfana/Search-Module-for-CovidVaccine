package com.DataJPA.searchModule.entity;

import javax.persistence.Embeddable;

@Embeddable
public class AdharCard {
	
	public AdharCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	private int adharNo;
	private String fingerprints;
	private String irisscan;
	
	public AdharCard(int adharNo, String fingerprints, String irisscan) {
		super();
		this.adharNo = adharNo;
		this.fingerprints = fingerprints;
		this.irisscan = irisscan;
	}
	public int getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(int adharNo) {
		this.adharNo = adharNo;
	}
	public String getFingerprints() {
		return fingerprints;
	}
	public void setFingerprints(String fingerprints) {
		this.fingerprints = fingerprints;
	}
	public String getIrisscan() {
		return irisscan;
	}
	public void setIrisscan(String irisscan) {
		this.irisscan = irisscan;
	}
	
	

}
