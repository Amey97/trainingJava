package com.Assignment2;

public class MedicalInsurance extends Employee {

	public MedicalInsurance(String name, String designation, Double salary) {
		super(name, designation, salary);
		// TODO Auto-generated constructor stub
		
	}
	
	
	
	public static void main(String[] args) {
		Employee E1 = new Employee("Amey", "System Associate", 10000.0);
		Employee E2 = new Employee("Sahil", "Programmer", 30000.0);
		Employee E3 = new Employee("Jitu", "Manager", 50000.0);
		Employee E4 = new Employee("babu", "Clerk", 1000.0);
		//E4.InsuranceScheme();
		System.out.println(E4.toString());
		System.out.println(E3.toString());
		System.out.println(E2.toString());
		System.out.println(E1.toString());
		

	}

}
class Employee{
	public String Name; 
	public String Designation;
	public Double salary;
	public String Scheme;
	public Employee(String name, String designation, Double salary) {
		this.Name = name;
		this.Designation = designation;
		this.salary = salary;
		this.Scheme = InsuranceScheme(this.salary,this.Designation);
	}
	
	@Override
	public String toString() {
		return "Employee [Name=" + Name + ", Designation=" + Designation + ", salary=" + salary + ", Scheme=" + Scheme
				+ "]";
	}

	String InsuranceScheme(Double salary2, String designation2) {
		String Scheme2 = new String();
		if(salary<5000)
		{
			Scheme2= "No Scheme";
		}
		else if((salary>=5000 || salary<20000) && Designation.equals("System Associate"))
		{
			Scheme2="Scheme C";
		}
		else if((salary>=20000 || salary<40000) && Designation.equals("Programmer"))
		{
			Scheme2="Scheme B";
		}
		else
		{
			Scheme2="Scheme A";
		}
		return Scheme2;
	}
	
}