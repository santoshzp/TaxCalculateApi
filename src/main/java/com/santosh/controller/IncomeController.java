package com.santosh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.santosh.entity.Income;
import com.santosh.service.IncomeService;
import com.santosh.service.exceptions.IncomeNotFoundException;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/v1/api/income")
@Slf4j
public class IncomeController {
	
	@Autowired
	private IncomeService incomeService;
	//1: add income
	@PostMapping("/addIncome")
	public ResponseEntity<Income> addIncomeInfo(@RequestBody Income income){
		log.info("IncomeController Controller class addIncome() Stated...");
		Income inc = incomeService.addIncome(income);
		log.info("IncomeController Controller class addIncome() Stated...");
		return new ResponseEntity<Income>(inc, HttpStatus.OK);
	}
	// 2: update income by id
	@PutMapping("/update")
	public ResponseEntity<Income> updateIncome(@RequestBody Income income){
		log.info("IncomeController Controller class updateIncome() Stated...");
		Income inc = incomeService.updateIncome(income);
		log.info("IncomeController Controller class updateIncome() Stated...");
		return new ResponseEntity<Income>(inc, HttpStatus.OK);
	}
	// 3: get income by Id
	@GetMapping("/getIncome/{id}")
	public ResponseEntity<?> fetchIncomeById(@PathVariable Integer id){
		log.info("IncomeController Controller class fetchIncomeById() Stated...");
		ResponseEntity<?> response = null;
		try {
			Income inc = incomeService.getIncomeById(id);
			response = new ResponseEntity<Income>(inc,HttpStatus.OK);
		} catch (IncomeNotFoundException e) {
			e.printStackTrace();
			throw e;
		}
		log.info("IncomeController Controller class fetchIncomeById() Stated...");
		return response;
	}
	// 4: delete income  by id
	
	// 5: get All income
	@GetMapping("/all")
	public ResponseEntity<List<Income>> getAllIncome(){
		log.info("IncomeController Controller class getAllIncome() Stated...");
		List<Income> listIncome = incomeService.getAllIncome();
		log.info("IncomeController Controller class getAllIncome() Stated...");
		return new ResponseEntity<List<Income>>(listIncome, HttpStatus.OK);
	}
	// 6: delete multiple income 
	// 7: update multiple income
	// 8: add multiple income
	public String addMultiplePersonIncome() {
		return null;
	}

}
