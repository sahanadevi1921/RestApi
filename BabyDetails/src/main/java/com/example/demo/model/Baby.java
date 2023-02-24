package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Baby {
	@Id
	private int babyId;
	private String bfn;
	private String bln;
	private String mn;
	private String fn;
	private String address;
	public int getBabyId() {
		return babyId;
	}
	public void setBabyId(int babyId) {
		this.babyId = babyId;
	}
	public String getBfn() {
		return bfn;
	}
	public void setBfn(String bfn) {
		this.bfn = bfn;
	}
	public String getBln() {
		return bln;
	}
	public void setBln(String bln) {
		this.bln = bln;
	}
	public String getMn() {
		return mn;
	}
	public void setMn(String mn) {
		this.mn = mn;
	}
	public String getFn() {
		return fn;
	}
	public void setFn(String fn) {
		this.fn = fn;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Baby [babyId=" + babyId + ", bfn=" + bfn + ", bln=" + bln + ", mn=" + mn + ", fn=" + fn + ", address="
				+ address + "]";
	}
	

}
