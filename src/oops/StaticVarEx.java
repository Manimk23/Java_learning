package oops;
//Here vehicleName and price are instance variables and its value is dependent on the objects we create for that class
//whereas vehicleType is static variable which means that its value is unique for all the complete class irrespective of the objects we create for the class
//We can access a static variable using classname.variablename (because static variable are class level variables)
class Studentdetails
{
	String name ;
	int RollNo;
	static  String School;
	void display()
	{
		System.out.println(name+":"+RollNo+":"+School);
	}
}
public class StaticVarEx {

	public static void main(String[] args) {
		Studentdetails obj = new Studentdetails();
		obj.name="Yash";
		obj.RollNo=1;
		
		Studentdetails obj1 = new Studentdetails();
		obj1.name="AK";
		obj1.RollNo=2;
		
		Studentdetails.School="Stanes";
		obj.display();
		obj1.display();

	}

}
