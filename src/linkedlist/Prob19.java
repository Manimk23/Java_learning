package linkedlist;

import java.util.LinkedList;

public class Prob19 {

	public static void main(String[] args) {
		LinkedList li = new LinkedList();
	    li.add(1);
	    li.add(2);
	    li.add(3);
	    li.add(4);
	    li.add(5);
	    System.out.println("Actual list--"+li);
	    System.out.println("After removing first element--"+li.removeFirst());
	    System.out.println("updated list--"+li);
	    
	}

}
