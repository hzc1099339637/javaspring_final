package com.cai.bean;

public class Food {
	private int id; //ʳƷ���
	private String fname; //ʳƷ����
	private int price; //ʳƷ���
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
