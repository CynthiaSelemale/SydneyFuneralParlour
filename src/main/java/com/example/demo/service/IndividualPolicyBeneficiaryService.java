package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.IndividualPlanPolicyHolder;
import com.example.demo.entity.IndividualPolicyBeneficiary;
import com.example.demo.repository.IndividualPolicyBeneficiaryRepository;

@Service
public class IndividualPolicyBeneficiaryService {

    @Autowired
    private IndividualPolicyBeneficiaryRepository repository;

    public List<IndividualPolicyBeneficiary> getAll() {
        return repository.findAll();
    }

    public Optional<IndividualPolicyBeneficiary> getById(Long id) {
        return repository.findById(id);
    }

    public IndividualPolicyBeneficiary save(IndividualPolicyBeneficiary entity) {
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

}
