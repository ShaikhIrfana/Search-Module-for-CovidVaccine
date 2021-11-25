package com.DataJPA.searchModule.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DataJPA.searchModule.entity.Member;
import com.DataJPA.searchModule.service.MemberserviceItf;
@RestController
@RequestMapping("/member")
public class Membercontroller {
	
	@Autowired
	private MemberserviceItf memberserviceItf;
	
	@PostMapping("/abc")
	private Member addMember(@RequestBody Member member) {
		return memberserviceItf.addMember(member);
	}
	
	@PutMapping("/put")
	private Member updateMember(@RequestBody Member member) {
		return memberserviceItf.updateMember(member);
	}
	
	@DeleteMapping("/delete")
	private void deleteMember(@RequestBody Member member) {
		 memberserviceItf.deleteMember(member);
	}
	
	@GetMapping("/idcard/{id}")
	private Member getMemberById(@PathVariable int id) {
		return memberserviceItf.getMemberById(id);
	}
	@GetMapping("/adharcard/{adharNo}")
	private Member getMemberByAdharNo(@PathVariable int adharNo) {
		return memberserviceItf.getMemberByAdharNo(adharNo);
	}
	@GetMapping("/pancard/{panNo}")
	private Member getMemberByPanNo(@PathVariable int panNo) {
		return memberserviceItf.getMemberByPanNo(panNo);
	}
	@GetMapping("/allmember")
	private List<Member> getAllMember(){
		return memberserviceItf.getAllMember();
	}
	

}
