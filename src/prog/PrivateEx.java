package prog;


class A
{
	private int a=10;
	
	private void displayA()
	{
		System.out.println("Displaying the value of a-->"+a);
	}
}

public class PrivateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A obj = new A();
		/*
		//compile time error
		System.out.println(obj.a);
		obj.display();
		*/
		


	}

}
