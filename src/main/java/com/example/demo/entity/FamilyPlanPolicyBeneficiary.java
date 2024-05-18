package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "family_plan_beneficiary_tbl")
public class FamilyPlanPolicyBeneficiary {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="first_name",nullable = false,length = 30)
	private String firstName;
	
	@Column(name="last_name",nullable = false,length = 30)
	private String lastName;
	
	@Column(name="id_number",nullable = false,length = 30)
	private String idNumber;
	
	@Column(name="gender",nullable = false,length = 30)
	private String gender;
	
	@Column(name="relationship",nullable = false,length = 30)
	private String relationship;
	
	@ManyToOne
	@JoinColumn(name="policy_number")
	private FamilyPlanPolicyHolder fpph;

	public FamilyPlanPolicyBeneficiary() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FamilyPlanPolicyBeneficiary(String firstName, String lastName, String idNumber, String gender,
			String relationship) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = idNumber;
		this.gender = gender;
		this.relationship = relationship;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getRelationship() {
		return relationship;
	}

	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

	public FamilyPlanPolicyHolder getFpph() {
		return fpph;
	}

	public void setFpph(FamilyPlanPolicyHolder fpph) {
		this.fpph = fpph;
	}
	
	
}
