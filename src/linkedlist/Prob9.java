package linkedlist;

import java.util.Arrays;
import java.util.LinkedList;

public class Prob9 {

	public static void main(String[] args) {
		LinkedList<String> List = new LinkedList();
		LinkedList<String> li = new LinkedList(Arrays.asList("zeebra", "giraffe"));
		
	    List.add("dog");
	    List.add("cat");
	    List.add("cow");
	    List.add("lion");
	    List.addAll(1, li);
	    System.out.println(List);
	}

}
