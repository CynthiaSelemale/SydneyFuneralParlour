package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.FamilyPlanPolicyBeneficiary;

public interface FamilyPlanBeneficiaryRepository extends JpaRepository<FamilyPlanPolicyBeneficiary, Long> {

}
