package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class Prob3 {

	public static void main(String[] args) {
		LinkedList<String> li = new LinkedList();
	    li.add("dog");
	    li.add("cat");
	    li.add("cow");
	    li.add("lion");
	    Iterator it = li.listIterator(1);
	    while(it.hasNext())
	    {
	    	System.out.println(it.next());
	    }

	}

}
