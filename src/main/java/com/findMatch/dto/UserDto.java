package com.findMatch.dto;

import java.util.Date;

public class UserDto {
	
	private Long profileId;
	private String name;
	private int age;
	private String city;
	private String dob;
	private String gender;
	private String caste;
	private String height;
	private String language;
	private String occupation;
	private String state;
	private String password;
	private  Long phoneno;
	private Date createdDate;
	private String profileCreatedBy;
	private String religion;
	public Long getProfileId() {
		return profileId;
	}
	public void setProfileId(Long profileId) {
		this.profileId = profileId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCaste() {
		return caste;
	}
	public void setCaste(String caste) {
		this.caste = caste;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(Long phoneno) {
		this.phoneno = phoneno;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public String getProfileCreatedBy() {
		return profileCreatedBy;
	}
	public void setProfileCreatedBy(String profileCreatedBy) {
		this.profileCreatedBy = profileCreatedBy;
	}
	public String getReligion() {
		return religion;
	}
	public void setReligion(String religion) {
		this.religion = religion;
	}
	public UserDto(Long profileId, String name, int age, String city, String dob, String gender, String caste,
			String height, String language, String occupation, String state, String password, Long phoneno,
			Date createdDate, String profileCreatedBy, String religion) {
		super();
		this.profileId = profileId;
		this.name = name;
		this.age = age;
		this.city = city;
		this.dob = dob;
		this.gender = gender;
		this.caste = caste;
		this.height = height;
		this.language = language;
		this.occupation = occupation;
		this.state = state;
		this.password = password;
		this.phoneno = phoneno;
		this.createdDate = createdDate;
		this.profileCreatedBy = profileCreatedBy;
		this.religion = religion;
	}
	public UserDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	}
