package oops;
class EmployeeDetails
{
	String Employeename;
	int Employeeid;
	static String OrgName;
	void display()
	{
		System.out.println(Employeename+":"+Employeeid+":"+OrgName);
	}
	 static void display1(EmployeeDetails obj1)
	{
		System.out.println(obj1.Employeename+":"+obj1.Employeeid+":"+OrgName);
	}
	
}

public class StaticMethodEx1 {

	public static void main(String[] args) {
		EmployeeDetails obj = new EmployeeDetails();
		obj.Employeename="x";
		obj.Employeeid=1234;
		
		EmployeeDetails obj1 = new EmployeeDetails();
		obj1.Employeename="y";
		obj1.Employeeid=12345;
		
		//accessing a sttaic variable
		EmployeeDetails.OrgName ="Amazon";
		obj.display();
		obj1.display();
		
		//accessing a static method
		EmployeeDetails.display1(obj1);
		

	}

}
