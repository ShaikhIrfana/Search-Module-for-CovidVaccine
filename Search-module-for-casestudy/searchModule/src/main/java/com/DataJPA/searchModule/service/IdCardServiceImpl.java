package com.DataJPA.searchModule.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DataJPA.searchModule.entity.IdCard;
import com.DataJPA.searchModule.repository.IdCardRepository;

@Service("idCardService")
public class IdCardServiceImpl implements IdCardServiceItf {
	
	@Autowired
	public IdCardRepository idCardRepository;

	@Override
	public IdCard addIdCard(IdCard idcard) {
		return idCardRepository.save(idcard);
		
	}

	
	public IdCard getPanCardByNumber(Integer panNo) {
		 idCardRepository.findById(panNo);
		return null;
	}

	
	public IdCard getAdharCardByNo(Integer adharno) {
		 idCardRepository.findById(adharno);
		return null;
	}


	

}
