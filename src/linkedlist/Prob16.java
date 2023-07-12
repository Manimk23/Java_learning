package linkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class Prob16 {

	public static void main(String[] args) {
		LinkedList<String> List = new LinkedList();
	    List.add("dog");
	    List.add("cat");
	    List.add("cow");
	    List.add("lion");
	    System.out.println("Actual list--"+List);
	    Collections.shuffle(List);
	    System.out.println("After shuffling--"+List);
	}

}
