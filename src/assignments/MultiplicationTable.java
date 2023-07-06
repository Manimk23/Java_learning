package assignments;
import java.util.Scanner;

public class MultiplicationTable {
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		 System.out.println("enter the table");
		int m = scanner.nextInt();
		System.out.println("enter the upto value table");
		int n = scanner.nextInt();
		for (int i=1;i<=n;i++)
		{
		int res= i*m;
		System.out.println(+m+ "*"+n+ "="+res);
				scanner.close();
    	 }
   
     }
}
	


