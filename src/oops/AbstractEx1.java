package oops;
//Abstract class can have both abstract and non-abstract methods
//we cannot create object for an abstract class instead we cant create object for its implementing class(AbstractClassEx)

abstract class bike2
//If we are not defining (writing logic) a method, then that method becomes an abstract method
	
{
	abstract void gear();
	
	void accelerate ()
	{
		System.out.println("Accelerate");
	}
	
}
abstract class bike3 extends bike2
{
	void refuel()
	{
		System.out.println("refuel");
	}
}

public class AbstractEx1  extends  bike3{
	@Override
	void gear() {
     System.out.println("gearing");		
	}

	public static void main(String[] args) {
		AbstractEx1 obj = new AbstractEx1();
		obj.gear();
		obj.refuel();
		obj.accelerate();
	}

	//cannot create object or instance to an abstract class(Bike2)
			//Bike10 obj1= new Bike10();
			
			

}


