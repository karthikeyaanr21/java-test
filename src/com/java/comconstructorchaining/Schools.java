package com.java.comconstructorchaining;

//import org.omg.CORBA.PUBLIC_MEMBER;

public class Schools extends School {
	public  void Studentaddress() {
		System.out.println("Trichy");
	
	}
	public static void main(String[] args) {
		Schools sch=new Schools();
		sch.Studentaddress();
		sch.studentname();
		sch.studentid();
		
		
	}
	

}
