package oops;
class Traindetails
{
	int TrainNo;
   Traindetails()
   {
	   System.out.println("inside constructor");
		System.out.println("TrainNo"+TrainNo);
   }
   {
	   TrainNo=384567;
	   System.out.println("inside instance block");
   }
   static
   {
	   System.out.println("inside static block");
   }
}

public class InstanceBlockEx {

	public static void main(String[] args) {
		Traindetails obj = new Traindetails();
		//Traindetails obj1 = new Traindetails();
	}

}
