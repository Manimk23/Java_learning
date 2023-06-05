package oops;
class Student3
{
	int Rollno1;
	String name1 ="name";
	int marks1 ;
	Student3 (int Rollno, String name, int marks)
	{
		Rollno1 = Rollno;
		name1 = name;
		marks1 = marks;
	}
	void displayStudenData()
	{
		System.out.println("The name of the student is"+name1+"and the Rollno is"+Rollno1+"with the score is"+marks1);
		String course ="JAT";
		System.out.println("The course name is"+course);
	}
}



public class ThisCurrentClassEx2 {

	public static void main(String[] args) {
		Student3 obj = new Student3(15,"VJ",100);
		obj.displayStudenData();
		
	}

}
