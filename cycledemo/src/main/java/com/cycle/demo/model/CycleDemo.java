package com.cycle.demo.model;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;

@Entity
public class CycleDemo {
	
	@Id
	 private int sno;
	 public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getCmodel() {
		return cmodel;
	}
	public void setCmodel(String cmodel) {
		this.cmodel = cmodel;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	private String cmodel;
	 private int price;
}
