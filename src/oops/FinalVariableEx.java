package oops;
/*
 * Java Final keyword is used to restrict the user and it can be used along with Variables, methods and classes
 */

//When i have declared a variable as final, i cannot change its value


public class FinalVariableEx {
	final int RollNo= 10;
	void displayRollNo()
	{
		System.out.println("The Roll No for Mr.X is :"+RollNo);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalVariableEx obj = new FinalVariableEx();
		obj.displayRollNo();
	}

}
