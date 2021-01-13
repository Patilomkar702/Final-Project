package com.medic.dto;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Patient extends Address{
	String fName;
	@Column(name = "last")
	String lName;
	String email;
	String password;
	String phone;
	String gender;
	String birthDate;
	float height;
	float weight;
	String status;
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Patient [fName=" + fName + ", lName=" + lName + ", email=" + email + ", password=" + password
				+ ", phone=" + phone + ", gender=" + gender + ", birthDate=" + birthDate + ", height=" + height
				+ ", weight=" + weight + ", status=" + status + ", id=" + id + ", flat=" + flat + ", street=" + street
				+ ", city=" + city + ", state=" + state + ", pinCode=" + pinCode + "]";
	}
	
	
	
	
}
