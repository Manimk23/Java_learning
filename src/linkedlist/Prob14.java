package linkedlist;

import java.util.LinkedList;

public class Prob14 {

	public static void main(String[] args) {
		LinkedList<String> List = new LinkedList();
	    List.add("dog");
	    List.add("cat");
	    List.add("cow");
	    List.add("lion");
	    System.out.println("Actual list--"+List);
	    List.removeAll(List);
	    System.out.println(List);
	}

}
