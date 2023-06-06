package oops;
class plane
{
	void fly()
	{
		System.out.println("take off");
	}
	void land()
	{
		//this.fly();
		fly();
		System.out.println("landing");
	}
}

public class ThisCurrentMethodEx {

	public static void main(String[] args) {
		
		plane obj = new plane();
		obj.land();
		
	}

}
