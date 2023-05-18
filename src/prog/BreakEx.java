package prog;

public class BreakEx {

	public static void main(String[] args) {
		// Break statement is used to terminate the loop immeditely and provides the output for it
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				break;
			}
			System.out.println(i);
		}

	}

}
