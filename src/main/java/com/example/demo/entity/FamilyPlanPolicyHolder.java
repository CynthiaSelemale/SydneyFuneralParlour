package com.example.demo.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="family_policy_holder_tbl")
public class FamilyPlanPolicyHolder {

	@Id
	@Column(name="policy_number",nullable = false,length = 30)
	private String policyNumber;
	
	@Column(name="id_number",nullable = false,length = 30)
	private String idNumber;
	
	@Column(name="first_name",nullable = false,length = 30)
	private String firstName;
	
	@Column(name="last_name",nullable = false,length = 30)
	private String lastName;
	
	@Column(name="title",nullable = false,length = 30)
	private String title;
	
	@Column(name="gender",nullable = false,length = 30)
	private String gender;
	
	@Column(name="nationality",nullable = false,length = 30)
	private String nationality;
	
	@Column(name="street",nullable = false,length = 30)
	private String street;
	
	@Column(name="city",nullable = false,length = 30)
	private String city;
	
	@Column(name="province",nullable = false,length = 30)
	private String province;
	
	@Column(name="postal_code",nullable = false,length = 30)
	private String postalCode;
	
	@Column(name="cellphone",nullable = false,length = 30)
	private String cellphone;
	
	@Column(name="worktelephone_number",nullable = false,length = 30)
	private String worktelePhone;
	
	@Column(name="hometelephone_number",nullable = false,length = 30)
	private String hometelePhone;
	
	@Column(name="email",nullable = false,length = 30)
	private String email;
	
	@Column(name="password",nullable = false,length = 30)
	private String password;
	
	@Column(name="plan_number",nullable = false,length = 30)
	private String planNumber;
	
	@OneToMany(mappedBy = "fpph",cascade = CascadeType.ALL)
	List<FamilyPlanPolicyBeneficiary> beneficiaries ;

	public FamilyPlanPolicyHolder() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FamilyPlanPolicyHolder(String policyNumber, String idNumber, String firstName, String lastName, String title,
			String gender, String nationality, String street, String city, String province, String postalCode,
			String cellphone, String worktelePhone, String hometelePhone, String email, String password,
			String planNumber, List<FamilyPlanPolicyBeneficiary> beneficiaries) {
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
		this.beneficiaries = beneficiaries;
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

	public List<FamilyPlanPolicyBeneficiary> getBeneficiaries() {
		return beneficiaries;
	}

	public void setBeneficiaries(List<FamilyPlanPolicyBeneficiary> beneficiaries) {
		this.beneficiaries = beneficiaries;
	}
	
	
	
}
