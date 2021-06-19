package com.cg.es.entity;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ElectronicProductType {
	@Id
	private int prdTypeId;
	private String name;
	
	public ElectronicProductType() {
		super();
	}
	
	
	public ElectronicProductType(int prdTypeId, String name) {
		super();
		this.prdTypeId = prdTypeId;
		this.name = name;
	}
	
	public int getPrdTypeId() {
		return prdTypeId;
	}
	public void setPrdTypeId(int prdTypeId) {
		this.prdTypeId = prdTypeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "ElectronicProductType [prdTypeId=" + prdTypeId + ", name=" + name + "]";
	}
	
	
	
}
