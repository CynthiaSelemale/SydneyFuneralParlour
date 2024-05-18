package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Policy_plan")
public class Plan {

	@Id
	private String id;
	
	@Column(name = "descrpition",nullable = true,length = 30)
	private String descrpition;
	
	@Column(name = "price",nullable = true,length = 30)
	private String price;

	//default constructor
	public Plan() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//constructor with fields
	public Plan(String id, String descrpition, String price) {
		super();
		this.id = id;
		this.descrpition = descrpition;
		this.price = price;
	}
	
	//setters and getters

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescrpition() {
		return descrpition;
	}

	public void setDescrpition(String descrpition) {
		this.descrpition = descrpition;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
}
