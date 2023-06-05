package prog;


public class ProtectedEx {
	protected int a2= 20;
	protected void displayA2()
	{
		System.out.println("The value of A2 is :"+a2);
	}

	 public static void main(String[] args) {
	        ProtectedEx obj = new ProtectedEx();
	        System.out.println("The value of a2 is " + obj.a2);
	        obj.displayA2();
	    }
	}


