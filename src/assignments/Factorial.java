package assignments;

public class Factorial {

	public static void main(String[] args) {
		//factorial for no. 10
		int FactorialNumber =10;
		int FactorailResult = 1;
		for (int i=1;i<=10;i++)
		{
			FactorailResult = FactorailResult*i;
			
		}
		System.out.println("factorial for "  +FactorialNumber+" is:" +FactorailResult);

	}

}
