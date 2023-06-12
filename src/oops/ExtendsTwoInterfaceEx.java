package oops;
interface TataAce
{
	void brake();
}
interface  TataAce1 extends TataAce
{
	void changeColor();
}

public class ExtendsTwoInterfaceEx implements TataAce, TataAce1 {
	@Override
	public void changeColor() {
    System.out.println("changing the color");		
	}

	@Override
	public void brake() {
    System.out.println("Applying brake");		
	}

	public static void main(String[] args) {
		ExtendsTwoInterfaceEx obj = new ExtendsTwoInterfaceEx();
		obj.brake();
		obj.changeColor();
	}

	

}
