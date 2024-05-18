package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.FamilyPlanPolicyHolder;
import com.example.demo.repository.FamilyPlanPolicyHolderRepository;

@Service
public class FamilyPlanPolicyHolderService {
  
	
    @Autowired
    private FamilyPlanPolicyHolderRepository policyHolderRepository;

    public List<FamilyPlanPolicyHolder> getAllPolicyHolders() {
        return policyHolderRepository.findAll();
    }

    public Optional<FamilyPlanPolicyHolder> findById(String id) {
        return policyHolderRepository.findById(id);
    }



	public void savePolicyHolder(FamilyPlanPolicyHolder policyHolder) {
		// TODO Auto-generated method stub
		policyHolderRepository.save(policyHolder);
	}

	public void deleteById(String policyNumber) {
		// TODO Auto-generated method stub
		 policyHolderRepository.deleteById(policyNumber);
    }

	
}


