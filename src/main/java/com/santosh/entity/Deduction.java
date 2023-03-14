package com.santosh.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="deduction")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Deduction {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer deductionId;
	private Double under80c;
	private Double under80D;
	private Double under24LoanInt;
	private Double under80gDonation;
	private Double hra;
	private Double stdDeduction;
	private Double lta;
	private Double mobReimbmt;
	private Double bookAndPerodicals;
	private Double foodCoupns;
	

}
