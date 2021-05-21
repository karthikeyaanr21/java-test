package com.java.com;

public class Bank extends AbstractDemo {
	

	@Override
	public void carloan() {
		System.out.println("carloanis50%");
	
		
	}
	
public static void main(String[] args) {
	Bank b= new Bank();
	b.goldloan();
	b.homeloan();
	b.carloan();
	
	
}
}
