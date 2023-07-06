package corejava;

public class FinallyBlock {

	public static void main(String[] args) {
		int a= 10;
		String s= "123";
		try
		{
			System.out.println(Integer.parseInt(s));
		}
		catch(Exception ex)
		{
			System.out.println("User defined exception message--> Number format exception");
			System.out.println(ex);
		}
		finally
		{
			System.out.println("Inside Finally Block-> this would be executed whether exception is thrown or not");
		}

	}

}
