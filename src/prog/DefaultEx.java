package prog;
class A1
{
	int a1 =20;
	void displayA1()
	{
		System.out.println("The value of a is :"+a1);
	}
}
public class DefaultEx {

	public static void main(String[] args) {
		A1 obj = new A1();
		System.out.println(obj.a1);
		obj.displayA1();

	}

}
