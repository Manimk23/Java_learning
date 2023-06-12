package oops;
interface RBI
{
	void rateOfInterest();
}
class SBI implements RBI 
{
@Override
public void rateOfInterest() {
  System.out.println("interest is 7.8");	
}
}
class Axis1 implements RBI
{

	@Override
	public void rateOfInterest() {
    System.out.println("interst is 9.2");		
	}
}
class IDFC implements RBI
{

	@Override
	public void rateOfInterest() {
    System.out.println("interest is 10");		
	}
	
}

public class InterfaceEx2 {

	public static void main(String[] args) {
		SBI sbi = new SBI();
		sbi.rateOfInterest();
		
		Axis1 axis = new Axis1 ();
		axis.rateOfInterest();
		
		IDFC idfc = new IDFC ();
		idfc.rateOfInterest();
		
	}

}


