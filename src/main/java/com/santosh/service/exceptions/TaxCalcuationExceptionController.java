package com.santosh.service.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.santosh.service.beans.ErrorMessage;

@ControllerAdvice
public class TaxCalcuationExceptionController {
	
	@ExceptionHandler(IncomeNotFoundException.class)
	public ErrorMessage incomeNotFoundException(String msg) {
		return new ErrorMessage(msg,HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
