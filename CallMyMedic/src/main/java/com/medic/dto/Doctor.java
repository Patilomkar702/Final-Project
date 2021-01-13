package com.medic.dto;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Doctor extends Address{
	String fName;
	@Column(name = "last")
	String lName;
	String email;
	String password;
	String phone;
	String gender;
	String birthDate;
	long fee;
	int experiance;
	String accountno;
	
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
	
	public long getFee() {
		return fee;
	}
	public void setFee(long fee) {
		this.fee = fee;
	}
	public int getExperiance() {
		return experiance;
	}
	public void setExperiance(int experiance) {
		this.experiance = experiance;
	}
	public String getAccountno() {
		return accountno;
	}
	public void setAccountno(String accountno) {
		this.accountno = accountno;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Doctor [fName=" + fName + ", lName=" + lName + ", email=" + email + ", password=" + password
				+ ", phone=" + phone + ", gender=" + gender + ", birthDate=" + birthDate + ", fee=" + fee
				+ ", Experiance=" + experiance + ",AccountNo = "+accountno + " , status=" + status + ", id=" + id + ", flat=" + flat + ", street=" + street
				+ ", city=" + city + ", state=" + state + ", pinCode=" + pinCode + "]";
	}
	
	
	
	
}
