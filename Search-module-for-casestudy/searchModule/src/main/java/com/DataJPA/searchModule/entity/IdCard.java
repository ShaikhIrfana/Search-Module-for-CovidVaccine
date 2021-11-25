package com.DataJPA.searchModule.entity;

import java.time.LocalDate;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="Id_Table")
public class IdCard {
	
	/*@SequenceGenerator( name="ID_SEQUENCE",
	sequenceName ="ID_SEQUENCE",
	allocationSize=1
	)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,
	generator = "ID_SEQUENCE"
	)*/
	
	@Id
	private int id;
	public IdCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String name;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	private LocalDate dob; 
	private String gender;
	private String address;
	private String city;
	private String state;
	private String pincode;
	
	public IdCard(int id, String name,LocalDate dob,String gender, String address, String city, String state,
			String pincode) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.gender = gender;
		this.address = address;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	/*public IdCard(int id, String name, LocalDate dob, String gender, String address, String city, String state,
			String pincode, AdharCard adharCard) {
		//super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.gender = gender;
		this.address = address;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.adharCard = adharCard;
	}*/
	
	@Embedded
	private AdharCard adharCard;
	
	@Embedded
	private PanCard panCard;
	
	public IdCard(int id, String name,LocalDate dob, String gender, String address, String city, String state,
			String pincode, AdharCard adharCard, PanCard panCard) {
		//super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.gender = gender;
		this.address = address;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.adharCard = adharCard;
		this.panCard = panCard;
	}
	public AdharCard getAdharCard() {
		return adharCard;
	}
	public void setAdharCard(AdharCard adharCard) {
		this.adharCard = adharCard;
	}
	public PanCard getPanCard() {
		return panCard;
	}
	public void setPanCard(PanCard panCard) {
		this.panCard = panCard;
	}
	
	

}
