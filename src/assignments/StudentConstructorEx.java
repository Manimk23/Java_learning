package assignments;

public class StudentConstructorEx {
	int id;
	String name;
	StudentConstructorEx(int i, String n)
	{
		id =i;
		name =n;
	}
	public void display()
	{
		System.out.println("The id of the student is "+id+" and the name is "+name);
	}
	public static void main(String args[])
	{
		StudentConstructorEx s1 = new StudentConstructorEx(1,"Ash");
		s1.display();
		
		StudentConstructorEx s2 = new StudentConstructorEx(2,"basker");
		s2.display();
		
		StudentConstructorEx s3 = new StudentConstructorEx(3,"cathy");
		s3.display();
	}

}
