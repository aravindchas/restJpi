package com.cg.es.entity;

import java.util.List;
import java.util.Set;


public class Customer {
 
	private String customerId;
	private String customerName;
	private String customerEmail;
	private String customerPhone;
	private Address customerAddress;
	private Set<ElectronicProductOrder> electronicProductOrderSet;
    private List<ElectronicProduct> productList;
	private Basket basket;
	
	
}
