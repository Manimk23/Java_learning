package oops;
class Student
{
	int Rollno;
	String name ="name";
	int marks ;
	Student (int Rollno, String name, int marks)
	{
		Rollno = Rollno;
		name = name;
		marks = marks;
	}
	void displayStudenData()
	{
		System.out.println("The name of the student is"+name+"and the Rollno is"+Rollno+"with the score is"+marks);
		String course ="JAT";
		System.out.println("The course name is"+course);
	}
}

public class ThiscurrentClassEx {

	public static void main(String[] args) {
		Student obj = new Student(9,"jai",80);
		obj.displayStudenData();
		

	}

}
