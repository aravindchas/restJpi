package com.cg.es.entity;

import java.time.LocalDate;
import java.util.Map;

public class ElectronicProductOrder {

	private String orderId;
	private LocalDate orderDate;
	private Customer customer;
	private Map<ElectronicProduct, Integer> productList;
	private Address ShippingAddress;
	private Address billingAddress;
	private double totalAmount;	
	private String orderStatus;
}