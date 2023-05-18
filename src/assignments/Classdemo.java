package assignments;

public class Classdemo {
	int num =10;
	/*
	 * Methods is a block of code to perform a specific action. Here the objective is to add 2 nos. 
	 * The main objective of methods is code reusability which means the same code will be reused for all the different parameters
	 * accessmodifier returnType methodName(argument1, argument2)
	 * {
	 * 
	 * }
	 * 
	 */
	public void addTwonumbers(int a, int b)
	{
		int result= a+b;
		System.out.println("Addition of two no is " +result);
		
	}
	public static void main(String args[])
	{
		//classname object = new classname();
		Classdemo obj1 = new Classdemo();
		System.out.println(obj1.num);
		obj1.addTwonumbers(10,9);
		Classdemo obj2 = new Classdemo();
		obj2.addTwonumbers(12,20);
		
	}


}
