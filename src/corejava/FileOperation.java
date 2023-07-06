package corejava;

import java.io.*;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;

public class FileOperation {

	public static void main(String[] args) throws IOException {
		//File Creation
    System.out.println("Enter the file path");
    Scanner sc = new Scanner(System.in);
    String path = sc.nextLine();
    
    System.out.println("Enter the file name");
    String name = sc.nextLine();
    //File reading
    File f = new File(path+name+".txt");
    if(f.createNewFile())
    {
    	System.out.println("created succesfully");
    }
    else {
    	System.out.println("exists or could not be created");
    }
    
    
    File fl = new File("D:\\testing\\java\\src\\corejava\\fileoperation.txt");
    Scanner sc2 = new Scanner(fl);
    System.out.println(sc2.nextLine());
    
    //File Writing
    FileWriter fwriter = new FileWriter("D:\\testing\\java\\src\\corejava\\fileoperation.txt");
    String WriteString = "writing the file";
    fwriter.write(WriteString);
   System.out.println("writed successfully...");
   fwriter.close();
   
   //FileDeletion
   File Fi = new File("D:\\testing\\java\\src\\corejava\\fileoperation.txt");
   if(Fi.exists())
   {
	   Fi.delete();
	   System.out.println("deleted successfully");
   }
   else {
	   System.out.println("problem while deletion");
   }
    
    
    
	}

}
