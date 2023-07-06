package corejava;

public class UserDefinedExceptionEx2 {

	int mark;
		// TODO Auto-generated method stub
		static void validatemark(int mark)
		{
		try
		{
			if (mark <40)
			{
				//throw new AgeException();
				throw new MarkValidation("marks should be greater atahan 40");
			}
			else
			{
				System.out.println("pass");
			}
		}
		catch(Exception ex)
		{
			System.out.println("Inside catch block");
			ex.printStackTrace();
			
		}
		}
		
		public static void main(String[] args) {
			
			validatemark(20);
	

	}

}

/*
//User defined Exception
1) user defined class should extend the Exception class
2) We should constructors for throwing the exception in the user defined exception class
3) We can have both default and parameritized constructors

*/
class MarkValidation extends Exception
{
	MarkValidation()
	{
		System.out.println("Age should be greater than 18");
	}
	
	MarkValidation(String str)
	{
		System.out.println(str);
	}
}

