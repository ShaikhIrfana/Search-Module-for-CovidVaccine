package com.DataJPA.searchModule.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.DataJPA.searchModule.entity.IdCard;

@Repository
public interface IdCardRepository extends JpaRepository<IdCard, Integer> {

	//public IdCard addIdCard (IdCard idCard);
	//public IdCard getPanCardByNumber(String panNo);
	// IdCard getAdharCardByNo(long adharno);
}
