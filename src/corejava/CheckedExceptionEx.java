package corejava;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionEx {

	public static void main(String[] args) {
		//using throw
		try {
			CheckedEx.CheckedException();
		} catch (FileNotFoundException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//using trycatch
		CheckedEx1.CheckedException();
	}
class CheckedEx
{
	static void CheckedException() throws InterruptedException, FileNotFoundException
	{
		//Interrupted exception
		Thread.sleep(5);
		
		//FileNotFoundexception
		File f= new File("D:\\testing\\java\\src\\basics\\exception.txt");
		FileReader fr = new FileReader(f);
	}
	
	
}
class CheckedEx1
{
	static void CheckedException()
	{
		//Interrupted exception
		try {
			Thread.sleep(3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//FileNotFoundexception
		File f= new File("D:\\testing\\java\\src\\basics");
		try {
			FileReader fr = new FileReader(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}

}
