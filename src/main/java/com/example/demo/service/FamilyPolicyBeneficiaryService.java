package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.FamilyPlanPolicyBeneficiary;
import com.example.demo.repository.FamilyPlanBeneficiaryRepository;

@Service
public class FamilyPolicyBeneficiaryService {

    @Autowired
    private FamilyPlanBeneficiaryRepository repository;

    public List<FamilyPlanPolicyBeneficiary> getAll() {
        return repository.findAll();
    }

    public Optional<FamilyPlanPolicyBeneficiary> getById(Long id) {
        return repository.findById(id);
    }

    public FamilyPlanPolicyBeneficiary save(FamilyPlanPolicyBeneficiary entity) {
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
