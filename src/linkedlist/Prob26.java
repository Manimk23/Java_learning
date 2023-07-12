package linkedlist;

import java.util.LinkedList;

public class Prob26 {

	public static void main(String[] args) {
		LinkedList li = new LinkedList();
	    li.add(1);
	    li.add(2);
	    li.add(3);
	    li.add(4);
	    li.add(5);
	    li.set(0, "integer");
	    System.out.println("After replacing--"+li);
	}

}
