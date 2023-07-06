package corejava;

public class ThrowExceptionEx {

	public static void main(String[] args) {
		ThrowEx.throwEx(10);
	}
}

		class ThrowEx
{
	int mobileNo;
	static void throwEx (int mobileNo)
	{
		if (mobileNo<10)
		{
			throw  new ArithmeticException("invalid mobile No");
		}
	 else
	{
		System.out.println("valid");
	}
	
}
	}


