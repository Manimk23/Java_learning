package assignments;

public class FactorialUsingreturntype {
	int factorialResult;
	//*public FactorialUsingreturntype()
	//*{
		//*factorialResult=1;
	//*	System.out.println("Constructor is called when the object is created. It wis the first method that will be executed");}

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



