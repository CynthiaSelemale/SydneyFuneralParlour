package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Plan;

public interface PlanRepository extends JpaRepository<Plan,String>{

}
