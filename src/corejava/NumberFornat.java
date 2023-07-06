package corejava;

public class NumberFornat {

	public static void main(String[] args) {
		int a= 10;
		String s= "xyz";
		try
		{
			System.out.println(Integer.parseInt(s));
		}
		catch(Exception ex)
		{
			System.out.println("User defined exception message--> Number format exception");
			System.out.println(ex);
		}

	}

}
