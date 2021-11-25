package com.DataJPA.searchModule.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DataJPA.searchModule.entity.Member;
import com.DataJPA.searchModule.exception.ExceptionClass;
import com.DataJPA.searchModule.repository.MemberRepository;

@Service
public class MemberServiceImpl implements MemberserviceItf {
	@Autowired
	private MemberRepository memberRepository;

	@Override
	public Member addMember(Member member) {
		try {
		return memberRepository.save(member);
		}catch(IllegalArgumentException e) {
			throw new ExceptionClass("Invalid Member Data");
		}catch(Exception e) {
			throw new ExceptionClass("All fields are Mandatory");
		}
		
	}

	@Override
	public Member updateMember(Member member) {
	//return memberRepository.save(member);
	try {
		return memberRepository.save(member);
	}catch(IllegalArgumentException e) {
		throw new ExceptionClass("Given Member Id is null, Please check");
	}catch(Exception e) {
		throw new ExceptionClass("Given Member Id does not exist in Database");
	}
		
	}

	@Override
	public boolean deleteMember(Member member) {
		memberRepository.delete(member);
		return false;
	}

	@Override
	public Member getMemberById(int id) {
		try {
			 return memberRepository.findById(id).get();
		}catch(IllegalArgumentException e) {
			throw new ExceptionClass("Given Member Id is null, Please check");
		}catch(Exception e) {
			throw new ExceptionClass("Given Member Id does not exist in Database");
		}
		//return memberRepository.findById(id).get();
		
	}

	@Override
	public Member getMemberByAdharNo(int adharNo) {
	 return memberRepository.findById(adharNo).get();
	 
		
	}

	@Override
	public Member getMemberByPanNo(int panNo) {
		return memberRepository.findById(panNo).get();
		
	}

	@Override
	public List<Member> getAllMember() {
	//List<Member> members=new ArrayList<Member>();
	return memberRepository.findAll();
		
	}

	

}
