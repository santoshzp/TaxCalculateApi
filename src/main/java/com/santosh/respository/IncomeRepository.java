package com.santosh.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.santosh.entity.Income;

public interface IncomeRepository extends JpaRepository<Income, Integer> {

}
