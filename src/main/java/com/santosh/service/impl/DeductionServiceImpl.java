package com.santosh.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.santosh.respository.DeductionRepository;
import com.santosh.service.DeductionService;

@Service
public class DeductionServiceImpl implements DeductionService {

	@Autowired
	private DeductionRepository deductionRepo;
	
	
}
