package linkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class Prob15 {

	public static void main(String[] args) {
		LinkedList<String> List = new LinkedList();
	    List.add("dog");
	    List.add("cat");
	    List.add("cow");
	    List.add("lion");
	    System.out.println("Actual list--"+List);
	    Collections.swap(List, 1, 3);
	    System.out.println("After swaping--"+List);
	}

}
