package linkedlist;

import java.util.LinkedList;

public class Prob24 {

	public static void main(String[] args) {
		LinkedList li = new LinkedList();
	    li.add(1);
	    li.add(2);
	    li.add(3);
	    li.add(4);
	    li.add(5);
	    
	    LinkedList li1 = new LinkedList();
	    li1.add(3);
	    li1.add(4);
	    li1.add(5);
	    li.retainAll(li1);
	    System.out.println("Common elements--"+li);
	}

}
