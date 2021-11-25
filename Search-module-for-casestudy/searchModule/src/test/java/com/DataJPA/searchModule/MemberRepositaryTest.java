package com.DataJPA.searchModule;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.DataJPA.searchModule.entity.AdharCard;
import com.DataJPA.searchModule.entity.IdCard;
import com.DataJPA.searchModule.entity.Member;
import com.DataJPA.searchModule.entity.PanCard;
import com.DataJPA.searchModule.repository.MemberRepository;
@SpringBootTest
class MemberRepositaryTest {
	@Autowired
	private MemberRepository memberRepository;


	@Test
	public void saveMember() {
		AdharCard adharCard = new AdharCard(41464, "scan","black");
		PanCard panCard = new PanCard(16509);
		IdCard idCard = new IdCard(1, "Irfana",LocalDate.of(1998, 10, 20), "Female", "Ravindra Nagar", "Miraj",
				"Maharashtra", "416410",adharCard,panCard);
	Member member = new Member(101,true,true,LocalDate.of(2021, 06, 12),LocalDate.of(2021, 10, 21),idCard);
	memberRepository.save(member);
}
	
	@Test
	public void addMember() {
		AdharCard adharCard = new AdharCard(41464, "scan","black");
		PanCard panCard = new PanCard(16509);
		IdCard idCard = new IdCard(1, "Irfana",LocalDate.of(1998, 10, 20), "Female", "Ravindra Nagar", "Miraj",
				"Maharashtra", "416410",adharCard,panCard);
	Member member = new Member(101,true,true,LocalDate.of(2021, 06, 12),LocalDate.of(2021, 10, 21),idCard);
	memberRepository.save(member);
}
	
	@Test
	public void updateMember() {
		AdharCard adharCard = new AdharCard(41464, "scan","black");
		PanCard panCard = new PanCard(16509);
		IdCard idCard = new IdCard(1, "Irfana",LocalDate.of(1998, 10, 20), "Female", "Ravindra Nagar", "Miraj",
				"Maharashtra", "416410",adharCard,panCard);
	Member member = new Member(101,true,true,LocalDate.of(2021, 06, 12),LocalDate.of(2021, 10, 21),idCard);
	memberRepository.save(member);
}
	
	@Test
	public void deleteMember() {
		AdharCard adharCard = new AdharCard(41464, "scan","black");
		PanCard panCard = new PanCard(16509);
		IdCard idCard = new IdCard(1, "Irfana",LocalDate.of(1998, 10, 20), "Female", "Ravindra Nagar", "Miraj",
				"Maharashtra", "416410",adharCard,panCard);
	Member member = new Member(101,true,true,LocalDate.of(2021, 06, 12),LocalDate.of(2021, 10, 21),idCard);
	memberRepository.delete(member);
}
	
}
