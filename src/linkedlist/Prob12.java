package linkedlist;

import java.util.LinkedList;

public class Prob12 {

	public static void main(String[] args) {
		LinkedList<String> List = new LinkedList();
	    List.add("dog");
	    List.add("cat");
	    List.add("cow");
	    List.add("lion");
	    System.out.println("Before removing the elements--"+List);
	    List.remove(2);
	    System.out.println("After removing the elements--"+List);
	}

}
