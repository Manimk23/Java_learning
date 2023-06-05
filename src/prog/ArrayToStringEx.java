package prog;
import java.util.Arrays;
public class ArrayToStringEx {


	public static void main(String[] args) {
		String str[]= {"Java", "is ", "my ","favorite","programming","language"};
		
		//sing toString
		String str1= Arrays.toString(str);
		System.out.println(str1);
		//join method
		String str2 = str1.join("", str);
		System.out.println(str2);
		
	}

}
