package oops;
//super can be used to refer immediate parent class instance variable.

class Car
{
	String carColor ="Red";
}
class Benz extends Car
{
	String carColor ="blue";
	void displaycolor()
	{
		System.out.println("The car color in the child class is-->"+carColor);
		System.out.println("The car color in the super class is -->"+super.carColor);
	}
}
public class SuperVariableEx {

	public static void main(String[] args) {
     Benz Benz = new Benz();
     Benz.displaycolor();
	}

}
