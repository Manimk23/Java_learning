package oops;
class HeavyVehicle
{
	String name="Truck";
	int VehicleNo =2345;
	static String VehicleType = "6- Wheel";
	
	HeavyVehicle()
	{
		System.out.println("Inside constructor");
	}
		void displaydata() 
		{
			System.out.println(name+":"+VehicleNo+":"+VehicleType);
		}
	static
	{
		System.out.println("inside static block");
		VehicleType ="6-wheel";
	}
	
}

public class StaticBlockEx {

	public static void main(String[] args) {
		HeavyVehicle obj = new HeavyVehicle();
		obj.displaydata();
	}

}
