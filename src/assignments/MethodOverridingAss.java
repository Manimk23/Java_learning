package assignments;
class Tempo
{
	void brake()
	{
		System.out.println("brake");
	}
}

public class MethodOverridingAss extends Tempo{
	void brake()
	{
		System.out.println("brake with sound");
	}

	public static void main(String[] args) {
		MethodOverridingAss obj = new MethodOverridingAss();
		obj.brake();
	}

}
