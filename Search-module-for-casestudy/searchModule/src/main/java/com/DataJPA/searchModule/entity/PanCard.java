package com.DataJPA.searchModule.entity;

import javax.persistence.Embeddable;

@Embeddable
public class PanCard {
	
	public PanCard() {
		//super();
		// TODO Auto-generated constructor stub
	}

	private Integer panNo;

	public PanCard(Integer panNo) {
		//super();
		this.panNo = panNo;
	}

	public Integer getPanNo() {
		return panNo;
	}

	public void setPanoNo(Integer panNo) {
		this.panNo = panNo;
	}
	

}
