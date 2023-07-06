package corejava;
import java.io.*;

public class FileWriteEx2 {

	public static void main(String[] args) throws IOException {
     BufferedWriter brwriter = new BufferedWriter(new FileWriter ("D:\\testing\\java\\src\\corejava\\sample,txt"));
     String str ="Writing using BufferedWriter";
     brwriter.write(str);
     System.out.println("writed succesfully...");
     brwriter.close();
	}

}
