package p1;

public class EmployeeTest {

	public static void main(String[] args) {
		
		//create employee object first 
		
		Employee e1=new Employee( 101 , "vijay",9571.71);
		
		e1.showAllDetails();
		System.out.println(Employee.getCompanyName());
		
	
		
	}

}
