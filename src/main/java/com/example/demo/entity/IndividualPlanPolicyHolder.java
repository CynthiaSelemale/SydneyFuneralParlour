package com.example.demo.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Individual_policy_holder_tbl")
public class IndividualPlanPolicyHolder {

	@Id
	@Column(name="policy_number",nullable = false,length = 30)
	private String policyNumber;
	
	@Column(name="id_number",nullable = true,length = 30)
	private String idNumber;
	
	@Column(name="first_name",nullable = true,length = 30)
	private String firstName;
	
	@Column(name="last_name",nullable = true,length = 30)
	private String lastName;
	
	@Column(name="title",nullable = true,length = 30)
	private String title;
	
	@Column(name="gender",nullable = true,length = 30)
	private String gender;
	
	@Column(name="nationality",nullable = true,length = 30)
	private String nationality;
	
	@Column(name="street",nullable = true,length = 30)
	private String street;
	
	@Column(name="city",nullable = true,length = 30)
	private String city;
	
	@Column(name="province",nullable = true,length = 30)
	private String province;
	
	@Column(name="postal_code",nullable = true,length = 30)
	private String postalCode;
	
	@Column(name="cellphone",nullable = true,length = 30)
	private String cellphone;
	
	@Column(name="worktelephone_number",nullable = true,length = 30)
	private String worktelePhone;
	
	@Column(name="hometelephone_number",nullable = true,length = 30)
	private String hometelePhone;
	
	@Column(name="email",nullable = true,length = 30)
	private String email;
	
	@Column(name="password",nullable = true,length = 30)
	private String password;
	
	@Column(name="plan_number",nullable = true,length = 30)
	private String planNumber;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "beneficiary_id")
	private IndividualPolicyBeneficiary beneficiary;

	public IndividualPlanPolicyHolder() {
		super();
		// TODO Auto-generated constructor stub
	}
     

	public IndividualPlanPolicyHolder(String policyNumber, String idNumber, String firstName, String lastName,
			String title, String gender, String nationality, String street, String city, String province,
			String postalCode, String cellphone, String worktelePhone, String hometelePhone, String email,
			String password, String planNumber, IndividualPolicyBeneficiary beneficiary) {
		super();
		this.policyNumber = policyNumber;
		this.idNumber = idNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.title = title;
		this.gender = gender;
		this.nationality = nationality;
		this.street = street;
		this.city = city;
		this.province = province;
		this.postalCode = postalCode;
		this.cellphone = cellphone;
		this.worktelePhone = worktelePhone;
		this.hometelePhone = hometelePhone;
		this.email = email;
		this.password = password;
		this.planNumber = planNumber;
		this.beneficiary = beneficiary;
	}

	public String getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public String getWorktelePhone() {
		return worktelePhone;
	}

	public void setWorktelePhone(String worktelePhone) {
		this.worktelePhone = worktelePhone;
	}

	public String getHometelePhone() {
		return hometelePhone;
	}

	public void setHometelePhone(String hometelePhone) {
		this.hometelePhone = hometelePhone;
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

	public String getPlanNumber() {
		return planNumber;
	}

	public void setPlanNumber(String planNumber) {
		this.planNumber = planNumber;
	}

	public IndividualPolicyBeneficiary getBeneficiary() {
		return beneficiary;
	}

	public void setBeneficiary(IndividualPolicyBeneficiary beneficiary) {
		this.beneficiary = beneficiary;
	}
	
	
}
