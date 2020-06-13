package com.cai.bean;

public class Food {
	private int id; //食品编号
	private String fname; //食品名称
	private int price; //食品编号
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Food [id=" + id + ", fname=" + fname + ", price=" + price + "]";
	}
}
