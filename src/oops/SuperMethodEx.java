package oops;
//super can be used to invoke immediate parent class method.

class Car1
{
	String carColor ="Green";
	void displaycolor()
	{
		System.out.println("The superclass carcolor is:"+carColor);
	}
}
class Audi extends Car1
{
	String carColor ="Black";
	void displaycolor()
	{
		System.out.println("The subclass carcolor is:"+carColor);
	}
	void getAllCarData()
	{
		displaycolor();
		super.displaycolor();
	}
}

public class SuperMethodEx {

	public static void main(String[] args) {
		Audi Au = new Audi();
		Au.getAllCarData();

	}

}
