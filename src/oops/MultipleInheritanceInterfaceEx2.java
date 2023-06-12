package oops;
interface Thor
{
	void accelerate();
}
interface Thor1
{
	void accelerate();
}

public class MultipleInheritanceInterfaceEx2  implements Thor, Thor1{
	@Override
	public void accelerate() {
     System.out.println("Accelerate with max speed 100km/hr...!");		
	}


	public static void main(String[] args) {
		MultipleInheritanceInterfaceEx2 obj = new MultipleInheritanceInterfaceEx2();
		obj.accelerate();
	}

	
}
