package assignments;

public class FactorialUsingreturntype {
	
		public int factorial (int factorailNumber)
		{
			int factorialresult =1;
			for(int i=1;i<=factorailNumber;i++)
			{
				factorialresult= factorialresult*i;
			}
			//
			return factorialresult;
			
		}
			

	public static void main(String args[])
	{
		FactorialUsingreturntype obj1 = new FactorialUsingreturntype();
		int result =obj1.factorial(5);
		System.out.println("The factorial value is "+result);
		FactorialUsingreturntype obj2 = new FactorialUsingreturntype();
		int result1=obj2.factorial(7);
		System.out.println("The factorial value is "+result);
	}


	}



