
class Employee{
	
	String name ;
	int id;
	int contact;
	
	void setEmployeeInfo(String name,int id,int contact) {
		
		this.name = name;
		this.id = id;
		this.contact = contact;
	}
	
	
class FE extends Employee
{
	void calHoursal(int nhour,int ppcost) {
		int total = nhour * ppcost;
		
		System.out.println("The Fe salary is"+total);
	}
}

class RE extends Employee
{
	void reSal(int annualSal) {
		
		int monsal = annualSal/12;
		System.out.println("The regular salary of Employee is"+monsal);
	}
	
class CE extends Employee
{
	void ceSal(int nop,int pps) {
		int Cesal = nop * pps;
		
		System.out.println("The salary of CE is"+Cesal);
	}
}
}
}

public class Inheritance6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee f = new Employee();
		f.set
		
		
		
		

	}

}


