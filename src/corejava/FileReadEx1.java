package corejava;
import java.io.*;
import java.util.Scanner;

public class FileReadEx1 {

	public static void main(String[] args) throws FileNotFoundException {
     File f = new File("D:\\testing\\java\\src\\corejava\\sample,txt");
     Scanner sc = new Scanner(f);
     System.out.println(sc.nextLine());
     
	}

}
