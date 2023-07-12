package linkedlist;

import java.util.Arrays;
import java.util.LinkedList;

public class Prob10 {

	public static void main(String[] args) {
		LinkedList<String> List = new LinkedList();
		 List.add("red");
		 List.add("blue");
		 List.add("red");
		 List.add("orange");
		 List.add("black");
		 List.add("red");
	    System.out.println("First occurence--"+List.indexOf("red"));
	    System.out.println("Last occurence---"+List.lastIndexOf("red"));
	}

}
