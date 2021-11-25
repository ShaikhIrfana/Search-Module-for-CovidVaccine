package com.DataJPA.searchModule.service;

import org.springframework.stereotype.Component;

import com.DataJPA.searchModule.entity.IdCard;

@Component
public interface IdCardServiceItf {
	public IdCard addIdCard (IdCard idcard);
	public IdCard getPanCardByNumber(Integer panNo);
	public IdCard getAdharCardByNo(Integer adharno);

}
