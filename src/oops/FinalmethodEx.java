package oops;
//When we add final keyword to the method, then that method cannot be overrided in the subclass
class Vehiclecolor
{
	final void displayVehiclecolor()
	{
		System.out.println("The vehicle color is green");
	}
}
public class FinalmethodEx extends  Vehiclecolor{
	//void displayVehiclecolor()
			//{
			//	System.out.println("The vehicle color is red");
			//}


	public static void main(String[] args) {
		FinalmethodEx obj = new FinalmethodEx();
		obj.displayVehiclecolor();
		

	}

}
