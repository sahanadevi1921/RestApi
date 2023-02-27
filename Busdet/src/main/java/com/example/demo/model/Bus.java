package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity                         
public class Bus {
	@Id
	private int busId;
	private String busName;
	private String BSP;
	private String BEP;
	private int price;
	public int getBusId() {
		return busId;
	}
	public void setBusId(int busId) {
		this.busId = busId;
	}
	public String getBusName() {
		return busName;
	}
	public void setBusName(String busName) {
		this.busName = busName;
	}
	public String getBSP() {
		return BSP;
	}
	public void setBSP(String bSP) {
		BSP = bSP;
	}
	public String getBEP() {
		return BEP;                   
	}
	public void setBEP(String bEP) {
		BEP = bEP;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Bus [busId=" + busId + ", busName=" + busName + ", BSP=" + BSP + ", BEP=" + BEP + ", price=" + price
				+ "]";
	}
	

}
