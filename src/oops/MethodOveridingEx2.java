package oops;
class Bank
{
	void interest()
	{
		System.out.println("Interest rate is 7");
	}
}


class HDFC extends Bank
{
	void interest()
	{
		System.out.println("Interest rate is 8");
	}
}

class ICICI extends Bank
{
	void interest()
	{
		System.out.println("Interest rate is 9");
	}
}

class Axis extends Bank
{
	void interest()
	{
		System.out.println("Interest rate is 10");
	}
}


public class MethodOveridingEx2 {

	public static void main(String[] args) {
		HDFC obj= new HDFC();
		obj.interest();
		
		ICICI obj1 = new ICICI();
		obj1.interest();
		
		Axis obj2 = new Axis();
		obj2.interest();


	}

}
