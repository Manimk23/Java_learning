package corejava;

public class NullPointerEx {

	public static void main(String[] args) {
    String s= null;
    try
    {
    	System.out.println(s.charAt(0));
    }
    catch(NullPointerException ex)
    {
    	System.out.println(ex);
    }
	}

}
