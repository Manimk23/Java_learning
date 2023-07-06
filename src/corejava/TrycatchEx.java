package corejava;

public class TrycatchEx {

	public static void main(String[] args) {
     int a,b,c;
     a=10;b=0;
     
     try
     {
    	 c=a/b;
     }
     catch (ArithmeticException ex)
     {
    	 System.out.println(ex);
     }
     System.out.println("oustide the try and catch block");
	}

}
