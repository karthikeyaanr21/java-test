package basic.program.filesinterface;

public class Employer implements Employee{

	@Override
	public void employeename() {
		System.out.println("Karthi");
		
	}

	@Override
	public void employeeid() {
		System.out.println("21");
		
	}
	public static void main(String[] args) {
		Employer emp=new Employer();
		emp.employeename();
		emp.employeeid();
		
	}

}
