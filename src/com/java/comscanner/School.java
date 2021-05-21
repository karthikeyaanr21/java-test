package com.java.comscanner;

import java.util.Scanner;

public class School {
	
	 
	public static void main(String[] args) {
		//next int()-using scanner
		Scanner sc=new Scanner(System.in) ;
		System.out.println("enter your id");
		int id = sc.nextInt();
		System.out.println("your id is"+ id);
		
			
	//next() & nextline()-to get string next -if we give space it wont work , next line- it will work if we gave space also
	Scanner sc1=new Scanner(System.in);
	System.out.println("enter your name");
	String namee = sc1.nextLine();
	System.out.println("your name is" + namee);
	
	//next 
	Scanner sca=new Scanner(System.in);
	System.out.println("enter your names");
	String name = sca.next();
	System.out.println("your name is" + name);
	
	//next float
	Scanner sc2=new Scanner(System.in);
	System.out.println("enter your value");
	float nos = sc2.nextFloat();
	System.out.println("your float no is" +nos);
	
	//nextdouble
	System.out.println("enter your salary");
	double sal = sc.nextDouble();
	System.out.println("your salary is "+ sal);
	
	//next long
	
	System.out.println("enter your mob no");
	long mobno = sc.nextLong();
	System.out.println("your mob no is" + mobno);
	
	

	
		
	
	
		
		
	}
	
	
	
	
	
	

}
