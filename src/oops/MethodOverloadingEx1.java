package oops;
//Ploymorphium--> many forms
//Under that we have 1. Method Overloding and 2. Method Overriding

//Method overloading or Compile time polymorphism. We use it for better readability of the code
//If a class has same methods name but with  difference in the no. of arguments or data type. Then it is called as method overloading


//1. We should have the same method name but difference in the no. of arguments or data type
//Method overloading will happen in the same class

//First we are going to see with difference in the no. of arguments
class Airthmetic
{
	int a,b;
	void add(int a, int b)
	{
		int result = a+b;
		System.out.println("The addition of 2 no is "+result);
	}
	void add (int a, int b, int c)
	{
		int result = a+b+c;
		System.out.println("The addition of 3 no is "+result);
	}
}

public class MethodOverloadingEx1 {

	public static void main(String[] args) {
		Airthmetic obj = new Airthmetic	();
		obj.add(5, 10);
		obj.add(5, 10, 15);

	}
}
