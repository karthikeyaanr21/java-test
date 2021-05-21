package com.javaproject.comconstructor;

public class ConstructorDemo {
	public  ConstructorDemo() {
		System.out.println("Karthi is tester");
	}

	public ConstructorDemo(int id)
	{
		System.out.println("employeeid  is " + id);
	}
	
	public ConstructorDemo(long no)
	{
		System.out.println("mob no is" + no);
	}
	public static void main(String[] args) {
		ConstructorDemo con=new ConstructorDemo();
		ConstructorDemo con1=new ConstructorDemo(21);
		ConstructorDemo con2=new ConstructorDemo(9659667561l);
	}
}
