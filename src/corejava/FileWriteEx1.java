package corejava;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteEx1 {

	public static void main(String[] args) throws IOException {
    FileWriter fwrite = new FileWriter("D:\\testing\\java\\src\\corejava\\sample,txt");
    String WriteString ="we are writing the file";
    fwrite.write(WriteString);
    System.out.println("file has write sucessfully");
    fwrite.close();
	}

}
