package assignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
     String str1 = "Mac";
     String Str2 ="Cam";
     char[] s1 = str1.toLowerCase().toCharArray();
     System.out.println(s1);
     Arrays.sort(s1);
     char[] s2 = str1.toLowerCase().toCharArray();
     Arrays.sort(s2);
     System.out.println(Arrays.equals(s1, s2));
   
     
	}

}
