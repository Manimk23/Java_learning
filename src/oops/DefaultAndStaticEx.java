package oops;
interface TataSumo
{
	void getTataSumoColor();
default void changeColor()
{
	System.out.println("changing the color");
}
static void setcolor()
{
	System.out.println("Setting the color for sumo");
}
}
public class DefaultAndStaticEx implements  TataSumo{
	@Override
	public void getTataSumoColor() {
    System.out.println("getting the updated color");		
	}

	public static void main(String[] args) {
		DefaultAndStaticEx obj = new DefaultAndStaticEx();
		obj.changeColor();
		obj.getTataSumoColor();
		
		TataSumo.setcolor();
		
	}

	

}
