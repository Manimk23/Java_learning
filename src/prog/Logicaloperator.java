package prog;

public class Logicaloperator {

	public static void main(String[] args) {
		// Logical operators
		int a=15,b=20,c=5;
		boolean value= false;
		System.out.println("the value is --"+!value);
		if((a>b)&&(b>c))
		{
		System.out.println("IF block");}
		else if((a>b)||(b>c)) {
		System.out.println("ELSE IF block");
		}
		else {
			System.out.println("ELSE block");
		}
			
		

	}

}
