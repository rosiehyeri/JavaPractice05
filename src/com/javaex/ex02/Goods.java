package com.javaex.ex02;

public class Goods {

	private String name;
	private int price;
	
	//수정(추가)한 부분 9~11라인
	 // 디폴트 생성자 추가
    public Goods() {
    }
	
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void showInfo() {
		System.out.println("상품명: " + name + "\t가격: " + price);
	}
	
	
}




