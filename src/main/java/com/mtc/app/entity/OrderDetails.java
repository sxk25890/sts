package com.mtc.app.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "orderdetails")
public class OrderDetails{



	@Id
	@Column(name = "quantityOrdered")
	private int quantityOrdered;
	@Column(name = "priceEach")
	private double priceEach;
	@Column(name = "orderLineNumber")
	private int orderLineNumber;
	


	/*
	@ManyToOne
	@JoinColumn(name = "productCode")
	private Products prod;
	
	
	public Products getProd() {
		return prod;
	}

	public void setProd(Products prod) {
		this.prod = prod;
	}
*/
	public OrderDetails() {
		super();
	}

	public OrderDetails(int orderNumber, String productCode, int quantityOrdered, double priceEach,
			int orderLineNumber) {
		super();
		//this.orderNumber = orderNumber;
		//this.productCode = productCode;
		this.quantityOrdered = quantityOrdered;
		this.priceEach = priceEach;
		this.orderLineNumber = orderLineNumber;
	}

/*	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public int getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}
*/
	
	
	public int getQuantityOrdered() {
		return quantityOrdered;
	}



	public void setQuantityOrdered(int quantityOrdered) {
		this.quantityOrdered = quantityOrdered;
	}

	public double getPriceEach() {
		return priceEach;
	}

	public void setPriceEach(double priceEach) {
		this.priceEach = priceEach;
	}

	public int getOrderLineNumber() {
		return orderLineNumber;
	}

	public void setOrderLineNumber(int orderLineNumber) {
		this.orderLineNumber = orderLineNumber;
	}
	
}

