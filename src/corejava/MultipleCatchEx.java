package corejava;

public class MultipleCatchEx {

	public static void main(String[] args) {
		String s= null;
	    try
	    {
	    	System.out.println(s.charAt(0));
	    }
	    catch(ArithmeticException ex)
	    {
	    	System.out.println(ex);
	    }
	    catch(Exception ex)
	    {
	    	System.out.println(ex);
	    }
	}

}
