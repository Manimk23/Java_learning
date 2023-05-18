package assignments;

public class FactorialUsingclass {
	public void factorial (int factorailNumber)
	{
		int factorialresult =1;
		for(int i=1;i<=factorailNumber;i++)
		{
			factorialresult= factorialresult*i;
		}
		System.out.println("Factorial of a number: "+factorailNumber+" is "+factorialresult);
		
	}
		

public static void main(String args[])
{
	FactorialUsingclass obj1 = new FactorialUsingclass();
	obj1.factorial(5);
	FactorialUsingclass obj2 = new FactorialUsingclass();
	obj2.factorial(7);
}


}
