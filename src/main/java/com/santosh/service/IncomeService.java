package com.santosh.service;

import java.util.List;

import com.santosh.entity.Income;

public interface IncomeService {

	public Income addIncome(Income income);

	public List<Income> getAllIncome();

	public Income updateIncome(Income income);

	public Income getIncomeById(Integer id);

}
