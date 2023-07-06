package assignments;

import java.util.Scanner;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the string:");
		String str =scanner.nextLine();
		
		boolean CharPresent[] = new boolean[256];
		for (int i=0;i<str.length();i++) {
			char ch =str.charAt(i);
			CharPresent[ch]= true;
		}
		for (int i=0;i<str.length();i++) {
			char ch =str.charAt(i);
			if(!CharPresent[ch]) {
				System.out.println("first non repeating char is:"+ch);
				scanner.close();
				
			}
		}
    
	}
}

