package oops;
//Method overloading with the different data type
class addition
{
	int a, b;
	void add (int a, int b)
	{
		int result = a+b;
		System.out.println("The addition of integer is "+result);
	}
	void add (double c, double d)
	{
		double result = c+d;
		System.out.println("The addition of double is "+result);
	}
}

public class MethodoverloadingEx2 {

	public static void main(String[] args) {
		addition obj = new addition();
		obj.add(10, 20);
		obj.add(13.5, 2.25);
		

	}

}
