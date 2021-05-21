package com.java.com;


public class Variabels { 
	//static
	static {
		int i=10;
		System.out.println("Static block 1 " + i);
	}
	
	//constructor
	public Variabels() {
		System.out.println("constructor2");
		}
	
	//static method - we need not create objects it will execute
	public static void add() {
		System.out.println("static method 3");
	}
	
	public static void main(String[] args) {
		System.out.println("HELLO 4");
		add();
		Variabels v= new Variabels();
		
		
	}
	
	
	
	
	
	

}
