package corejava;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class FileCreationUsingScanner {

	public static void main(String[] args) throws IOException {
     System.out.println("Enter the file path");
     Scanner sc = new Scanner(System.in);
     String path = sc.nextLine();
     
     System.out.println("Enter the file name");
     Scanner sc1 = new Scanner(System.in);
     String name = sc.nextLine();
     
     File f = new File(path+name+",txt");
     f.createNewFile();
     
     
	}

}
