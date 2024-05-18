package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="individual_plan_beneficiary_tbl")
public class IndividualPolicyBeneficiary {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="first_name",length = 30)
	private String firstName;
	
	@Column(name="last_name",length = 30)
	private String secondName;
	
	@Column(name="id_number",length = 30)
	private String idNumber;
	
	@Column(name="gender",length = 30)
	private String gender;
	
	@Column(name="relationship",length = 30)
	private String relationship;
	
	@OneToOne(mappedBy = "beneficiary")
     private IndividualPlanPolicyHolder holder;
   
	public IndividualPolicyBeneficiary() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IndividualPolicyBeneficiary(String firstName, String lastName, String idNumber, String gender,
			String relationship) {
		super();
		this.firstName = firstName;
		this.secondName = lastName;
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



	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public IndividualPlanPolicyHolder getHolder() {
		return holder;
	}

	public void setHolder(IndividualPlanPolicyHolder holder) {
		this.holder = holder;
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
	
}
