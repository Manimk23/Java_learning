package oops;
interface tripdetails
{
	void list();
	void transport();
	void bookings();
	
}
public class InterfaceEx1 implements tripdetails {
	@Override
	public void list() {
    System.out.println("name list");		
	}

	@Override
	public void transport() {
		System.out.println("mode of transport");		
	}

	@Override
	public void bookings() {
		System.out.println("hotel bookings");			
	}

	public static void main(String[] args) {
		InterfaceEx1 obj = new InterfaceEx1();
		obj.list();
		obj.transport();
		obj.bookings();
	}

	

}
