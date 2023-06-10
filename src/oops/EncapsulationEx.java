package oops;
class FlightDetails
{
	private String flightname;
	private int flightno;
	
	public void setFlightname(String name) {
		flightname = name;
	}
	
	public void setFlightno(int no) {
		 flightno = no;
		}
	
	public String getFlightname() {
		return flightname;
	}
	
	public int getFlightno() {
		return flightno;
	}
	
	
	
}

public class EncapsulationEx {

	public static void main(String[] args) {
		FlightDetails obj = new FlightDetails();
		obj.setFlightname("Air India");
		obj.setFlightno(257);
		System.out.println(obj.getFlightname());
		System.out.println(obj.getFlightno());
	}

}
