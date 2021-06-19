package com.cg.es.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class ElectronicProduct {
	@Id
	private int   code;
	private String name;
	private double price;
	private String image;
	private String createDate;
	
	@Embedded
	@OneToOne(cascade=CascadeType.ALL)
	private ElectronicProductType productType;
	
	
	
	public ElectronicProduct(){
		super();
		
	}
	
	public ElectronicProduct(int code, String name, double price, String image, String createDate,ElectronicProductType productType) 
			{
		super();
		this.code = code;
		this.name = name;
		this.price = price;
		this.image = image;
		this.createDate = createDate;
		this.productType = productType;
	}

	public int getCode() {
		return code;
	}



	public void setCode(int code) {
		this.code = code;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public String getImage() {
		return image;
	}



	public void setImage(String image) {
		this.image = image;
	}



	public String getCreateDate() {
		return createDate;
	}



	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	
	

	public ElectronicProductType getProductType() {
		return productType;
	}



	public void setProductType(ElectronicProductType productType) {
		this.productType = productType;
	}

	@Override
	public String toString() {
		return "ElectronicProduct [code=" + code + ", name=" + name + ", price=" + price + ", image=" + image
				+ ", createDate=" + createDate + ", productType=" + productType + "]";
	}	
	
	
	
}
