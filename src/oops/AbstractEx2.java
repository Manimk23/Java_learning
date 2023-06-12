package oops;
//Abstract class can have constructor and its variables can be final, static , non-final and non-static.
abstract class shape
{
	shape()
	{
		System.out.println("Shape is a default constructor");
	}
	
	
	final int q=10;
	int b=20;
	static String name="java";
	
	abstract void draw();
    void erase()
    {
     System.out.println("erase");
    }
}
class rectangle extends shape
{

	@Override
	void draw() {
    System.out.println("Drawing rectangle");		
	}
	
}
class circle extends shape
{

	@Override
	void draw() {
    System.out.println("Drawing circle");		
	}
	
}

public class AbstractEx2 {

	public static void main(String[] args) {
		rectangle obj = new rectangle();
		obj.draw();
		obj.erase();
		
		circle obj1 = new circle();
		obj1.draw();
		obj1.erase();
		
	}

}
