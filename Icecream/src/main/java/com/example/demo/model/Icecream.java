package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Icecream {
	@Id
	private int id;
	private String Flavors;
	private String iceShop;
	private String Toppings;
	private int price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFlavors() {
		return Flavors;
	}
	public void setFlavors(String flavors) {
		Flavors = flavors;
	}
	public String getIceShop() {
		return iceShop;
	}
	public void setIceShop(String iceShop) {
		this.iceShop = iceShop;
	}
	public String getToppings() {
		return Toppings;
	}
	public void setToppings(String toppings) {
		Toppings = toppings;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Icecream [id=" + id + ", Flavors=" + Flavors + ", iceShop=" + iceShop + ", Toppings=" + Toppings
				+ ", price=" + price + "]";
	}
	
	
	

}
