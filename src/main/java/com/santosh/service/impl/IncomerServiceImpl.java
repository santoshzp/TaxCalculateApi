package com.santosh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.santosh.entity.Income;
import com.santosh.respository.IncomeRepository;
import com.santosh.service.IncomeService;
import com.santosh.service.exceptions.IncomeNotFoundException;

@Service
public class IncomerServiceImpl implements IncomeService {

	@Autowired
	private IncomeRepository incomeRepo;
	@Override
	public Income addIncome(Income income) {
		return incomeRepo.save(income);
	}
	@Override
	public List<Income> getAllIncome() {
		return incomeRepo.findAll();
	}
	@Override
	public Income updateIncome(Income income) {
		return incomeRepo.save(income);
	}
	@Override
	public Income getIncomeById(Integer id) {
		//return incomeRepo.getById(id);
		return incomeRepo.findById(id).orElseThrow(()->new IncomeNotFoundException("Income Id"+ id +" Not Exist"));
	}
}
