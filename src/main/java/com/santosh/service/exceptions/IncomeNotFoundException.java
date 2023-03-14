package com.santosh.service.exceptions;

public class IncomeNotFoundException extends RuntimeException {

	public IncomeNotFoundException() {
		super();
	}

	public IncomeNotFoundException(String msg) {
		super(msg);
	}
}
