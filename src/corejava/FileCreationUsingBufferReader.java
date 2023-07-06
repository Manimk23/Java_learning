package corejava;
import java.io.*;
public class FileCreationUsingBufferReader {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter the file path");
    BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
    String path = br.readLine();
    
    System.out.println("Enter the file name");
    BufferedReader br1 = new BufferedReader(new InputStreamReader (System.in));
    String name = br1.readLine();
    
    File f= new File(path+name+".txt");
    f.createNewFile();
	}

}
