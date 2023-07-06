package corejava;
import java.io.*;

public class FileReadEx2 {

	public static void main(String[] args) throws IOException {
		File f = new File("D:\\testing\\java\\src\\corejava\\sample,txt");
    BufferedReader br = new BufferedReader(new FileReader(f));
    String str;
    while((str=br.readLine())!= null)
    {
    	System.out.println(str);
    }
    
	}

}
