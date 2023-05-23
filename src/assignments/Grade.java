package assignments;

public class Grade {
	int marks;
	String name, pass, fail, A, B, C, D;
	public void checkPassOrFail (int marks, String name)
	{
		if (marks >=40)
		{
		System.out.println("Pass");	
		}
		else {
			System.out.println("Fail");	
			
		}}
		public void checkGrade (int marks)
		{
			if (marks >= 90)
			{
				
				System.out.println("A");		
			}
			else if(marks >=80)
			{
				System.out.println("B");	
			}
			else if(marks >=70)
			{
				System.out.println("C");	
			}
			else if(marks >=60)
			{
				System.out.println("D");	
			}
			else {
				System.out.println("Fail");	
			}
		}
			
		public static void main(String[] args) {
	        Grade s1 = new Grade();
	        s1.checkPassOrFail(90, "Ash");
	        s1.checkGrade(90);
	        
	        Grade s2 = new Grade();
	        s2.checkPassOrFail(80, "Bash");
	        s2.checkGrade(80);
	        
	        Grade s3 = new Grade();
	        s3.checkPassOrFail(100, "Mash");
	        s3.checkGrade(100);
	    }
	}
