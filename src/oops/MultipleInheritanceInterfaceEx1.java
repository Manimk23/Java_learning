package oops;
interface lorry
{
	void loading();
	}
interface lorry1
{
	void unloading();
}
public class MultipleInheritanceInterfaceEx1 implements lorry, lorry1 {
	@Override
	public void unloading() {
		System.out.println("loading");
		
	}

	@Override
	public void loading() {
		System.out.println("Unloading");
		
	}

	public static void main(String[] args) {
		MultipleInheritanceInterfaceEx1 obj = new MultipleInheritanceInterfaceEx1();
		obj.loading();
		obj.unloading();
	}

	

}
