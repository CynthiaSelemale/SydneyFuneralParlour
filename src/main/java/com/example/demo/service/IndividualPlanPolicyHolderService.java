package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.IndividualPlanPolicyHolder;
import com.example.demo.repository.IndividualPolicyHolderRepository;

@Service
public class IndividualPlanPolicyHolderService {

    @Autowired
    private IndividualPolicyHolderRepository policyHolderRepository;

    public List<IndividualPlanPolicyHolder> getAllPolicyHolders() {
        return policyHolderRepository.findAll();
    }

    public Optional<IndividualPlanPolicyHolder> getPolicyHolderById(String id) {
        return policyHolderRepository.findById(id);
    }

    public void savePolicyHolder(IndividualPlanPolicyHolder policyHolder) {
        policyHolderRepository.save(policyHolder);
    }

    public void deletePolicyHolder(String id) {
        policyHolderRepository.deleteById(id);
    }
}
