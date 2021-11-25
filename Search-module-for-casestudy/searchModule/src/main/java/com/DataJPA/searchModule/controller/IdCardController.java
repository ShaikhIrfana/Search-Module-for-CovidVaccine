package com.DataJPA.searchModule.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DataJPA.searchModule.entity.IdCard;
import com.DataJPA.searchModule.service.IdCardServiceItf;

@RestController
@RequestMapping(value="/search")
public class IdCardController {
	
	@Autowired
	private IdCardServiceItf idCardServiceItf;
	
	@PostMapping("/add")
	private IdCard addIdCard(@RequestBody IdCard idCard) {
		return idCardServiceItf.addIdCard(idCard);
		}
	
	@GetMapping("/add/panCard/{panNo}")
	private IdCard getPanCardByNumber(@PathVariable ("panNo") int panNo) {
		return idCardServiceItf.getPanCardByNumber(panNo);
	}
	
	@GetMapping("/add/adharCard/{adharNo}")
	private IdCard getAdharCardByNumber(@PathVariable ("adharNo") int adharNo) {
		return idCardServiceItf.getAdharCardByNo(adharNo);
		
	}
	
			

}
