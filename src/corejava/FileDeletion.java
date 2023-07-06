package corejava;
import java.io.File;

public class FileDeletion {

	public static void main(String[] args) {
  File f = new File ("D:\\testing\\java\\src\\corejava\\delete.txt");
  if (f.exists())
  {
	  f.delete();
	  System.out.println("successfully deleted");
  }
  else
  {
	  System.out.println("defect while deletion");
  }
	}

}
