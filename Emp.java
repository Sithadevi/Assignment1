class Employee
{
	// variables or methods
	int emp_id;
	String name;
	String department;
	double salary;
	
	void displayEmloyeeDetails()
	{
		System.out.println("id is"+emp_id);
		System.out.println("name is"+name);
		System.out.println("Depat is"+department);
		System.out.println("Slary is"+salary);
		
		
	}
	String checkFOrBonusoption()
	{
		if(salary>7500.00)
			return "you  can  apply for loan";
		return "you cannot apply for loan";
	}
	
}

public class Emp {
	public static void main(String [] args)
	{
		System.out.println("Employe demo app");
		Employee obj = new Employee();
		obj.emp_id=125;
		obj.name="chinnu";
		obj.department="developer";
		obj.salary=45000.0;
		
		obj.displayEmloyeeDetails();
		//String message=obj.checkForLoanOptions();
		//System.out.println("your info"+ message);
		System.out.println(obj.checkFOrBonusoption());
	}
}
