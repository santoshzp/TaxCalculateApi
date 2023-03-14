package com.santosh.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.santosh.entity.Deduction;

public interface DeductionRepository extends JpaRepository<Deduction, Integer> {

}
