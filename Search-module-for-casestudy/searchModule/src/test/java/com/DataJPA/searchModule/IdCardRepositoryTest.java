package com.DataJPA.searchModule;

import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.DataJPA.searchModule.entity.AdharCard;
import com.DataJPA.searchModule.entity.IdCard;
import com.DataJPA.searchModule.entity.PanCard;
import com.DataJPA.searchModule.repository.IdCardRepository;

@SpringBootTest
class IdCardRepositoryTest {

	@Autowired
	private IdCardRepository idCardRepository;

	@Test
	public void saveIdCard() {
		AdharCard adharCard = new AdharCard(41464, "scan","black");
		PanCard panCard = new PanCard(16509);
		IdCard idCard = new IdCard(1, "Irfana",LocalDate.of(1998, 10, 20), "Female", "Ravindra Nagar", "Miraj",
				"Maharashtra", "416410",adharCard,panCard);
		  idCardRepository.save(idCard);
	}
	@Test
	public void updateIdCard() {
		AdharCard adharCard = new AdharCard(41464, "scan","black");
		PanCard panCard = new PanCard(16509);
		IdCard idCard = new IdCard(1, "Irfana",LocalDate.of(1998, 10, 20), "Female", "Ravindra Nagar", "Miraj",
				"Maharashtra", "416410",adharCard,panCard);
		idCardRepository.save(idCard);
	}
	
	@Test
	public void addIdCard() {
		AdharCard adharCard = new AdharCard(41464, "scan","black");
		PanCard panCard = new PanCard(16509);
		IdCard idCard = new IdCard(1, "Irfana",LocalDate.of(1998, 10, 20), "Female", "Ravindra Nagar", "Miraj",
				"Maharashtra", "416410",adharCard,panCard);
		idCardRepository.save(idCard);
	}
	@Test
	public void DeleteIdCard() {
		AdharCard adharCard = new AdharCard(41464, "scan","black");
		PanCard panCard = new PanCard(16509);
		IdCard idCard = new IdCard(1, "Irfana",LocalDate.of(1998, 10, 20), "Female", "Ravindra Nagar", "Miraj",
				"Maharashtra", "416410",adharCard,panCard);
		idCardRepository.delete(idCard);
	}
	
	

	
}
