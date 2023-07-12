package linkedlist;

import java.util.LinkedList;

public class Prob13 {

	public static void main(String[] args) {
		LinkedList<String> List = new LinkedList();
	    List.add("dog");
	    List.add("cat");
	    List.add("cow");
	    List.add("lion");
	    System.out.println("Actual list--"+List);
	    List.removeFirstOccurrence("dog");
	    System.out.println("Removing first element--"+List);
	    List.removeLastOccurrence("lion");
	    System.out.println("Remove last element--"+List);
	}

}
