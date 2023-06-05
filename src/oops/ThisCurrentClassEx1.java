package oops;
class Student2
{
	int Rollno;
	String name ="name";
	int marks ;
	Student2 (int Rollno, String name, int marks)
	{
		this.Rollno = Rollno;
		this.name = name;
		this.marks = marks;
	}
	void displayStudenData()
	{
		System.out.println("The name of the student is" +name+ "and the Rollno is" +Rollno+ "with the score is" +marks);
		String course ="JAT";
		System.out.println("The course name is"+course);
	}
}



public class ThisCurrentClassEx1 {

	public static void main(String[] args) {
		Student2 obj = new Student2(01,"AK",100);
		obj.displayStudenData();
	}

}
