package oops;
class ship
{
	ship()
	{
		System.out.println("default constructor");
	}
	ship(String name)
	{
		this();
		System.out.println("The ship sailing in Indian ocean is" +name);
	}
}

public class ThisCurrentConstructorEx {

	public static void main(String[] args) {
		ship obj = new ship("orizon Cruize");
	}

}
