package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.FamilyPlanPolicyBeneficiary;
import com.example.demo.entity.FamilyPlanPolicyHolder;
import com.example.demo.entity.IndividualPlanPolicyHolder;
import com.example.demo.entity.IndividualPolicyBeneficiary;
import com.example.demo.entity.Plan;
import com.example.demo.repository.FamilyPlanPolicyHolderRepository;
import com.example.demo.repository.IndividualPolicyHolderRepository;
import com.example.demo.repository.PlanRepository;

@SpringBootApplication
public class SydneyFuneralParlourFinalAgainApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SydneyFuneralParlourFinalAgainApplication.class, args);
	}

	@Autowired
	private IndividualPolicyHolderRepository FamilyRepo;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*
		 * FamilyPlanPolicyBeneficiary i1 = new FamilyPlanPolicyBeneficiary("Bonolo",
		 * "Selemale", "899022", "Female", "Friend"); FamilyPlanPolicyBeneficiary i2 =
		 * new FamilyPlanPolicyBeneficiary("Katleho", "Makoro", "272622", "Male",
		 * "Sibling"); FamilyPlanPolicyBeneficiary i3 = new
		 * FamilyPlanPolicyBeneficiary("Botshelo", "Rapodile", "876282", "Male",
		 * "Relative");
		 * 
		 * //create the list List<FamilyPlanPolicyBeneficiary> list = new ArrayList<>();
		 * list.add(i1); list.add(i2); list.add(i3);
		 * 
		 * //create the policy holder FamilyPlanPolicyHolder p1 = new
		 * FamilyPlanPolicyHolder("F868782", "767452", "Hellen", "Mdluli", "Ms",
		 * "Female", "African", "21 jump street", "Pretoria", "Gauteng", "1029",
		 * "98721", "9876876", "78652", "Mdluli@gmail", "psaaw", "I1", list);
		 * 
		 * i1.setFpph(p1); i2.setFpph(p1); i3.setFpph(p1);
		 * 
		 * FamilyRepo.save(p1);
		 *
		 // Creating an instance of IndividualPlanPolicyHolder
        IndividualPlanPolicyHolder policyHolder = new IndividualPlanPolicyHolder();
        policyHolder.setPolicyNumber("I319283");
        policyHolder.setIdNumber("1234567890");
        policyHolder.setFirstName("Alice");
        policyHolder.setLastName("Smith");
        policyHolder.setTitle("Ms.");
        policyHolder.setGender("Female");
        policyHolder.setNationality("American");
        policyHolder.setStreet("123 Main Street");
        policyHolder.setCity("Anytown");
        policyHolder.setProvince("California");
        policyHolder.setPostalCode("12345");
        policyHolder.setCellphone("555-123-4567");
        policyHolder.setWorktelePhone("555-987-6543");
        policyHolder.setHometelePhone("555-555-5555");
        policyHolder.setEmail("alice@example.com");
        policyHolder.setPassword("password123");
        policyHolder.setPlanNumber("P123456");

        // Creating an instance of IndividualPolicyBeneficiary
        IndividualPolicyBeneficiary beneficiary = new IndividualPolicyBeneficiary();
        beneficiary.setFirstName("John");
        beneficiary.setLastName("Doe");
        beneficiary.setIdNumber("987654321");
        beneficiary.setGender("Male");
        beneficiary.setRelationship("Spouse");
       
        
        policyHolder.setBeneficiary(beneficiary);
        FamilyRepo.save(policyHolder);
        // Displaying the beneficiary details
        System.out.println("Beneficiary Details:");
        System.out.println("First Name: " + beneficiary.getFirstName());
        System.out.println("Last Name: " + beneficiary.getLastName());
        System.out.println("ID Number: " + beneficiary.getIdNumber());
        System.out.println("Gender: " + beneficiary.getGender());
        System.out.println("Relationship: " + beneficiary.getRelationship());
     */
		}

}
