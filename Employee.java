package p1;

class Employee
{
	
	//static data 
	
	private static String compName;///all are global
	
	//SPECIAL BLOCK
	static
	{
	Employee.compName="SLK";
		
	}
	
	//instance data
	
	private int empId;
	private String empName;////all are global
	private double empSal;
	
	//special methods-cONSTRUCTOR
	
	Employee(int eid,String ename,double esal)
	{
		this.empId=eid;
		this.empName=ename;
		this.empSal=esal;
		
		
	}
	//static methods-cONSTRUCTOR
	
	public static String getCompanyName()
	{
		return Employee.compName;
		//System.out.println("Id ="+this.empId);
	}
	

	//instance methods
	
	void showAllDetails()
	{
		System.out.println("Id ="+this.empId);
		System.out.println("Name ="+this.empName);
		System.out.println("Salary ="+this.empSal);
		System.out.println("Company ="+Employee.compName);
		
	}

}
