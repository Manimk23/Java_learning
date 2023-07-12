package linkedlist;

import java.util.Arrays;
import java.util.LinkedList;

public class Prob11 {

	public static void main(String[] args) {
		LinkedList<String> List = new LinkedList();
	    List.add("dog");
	    List.add("cat");
	    List.add("cow");
	    List.add("lion");
	    for(int i=0;i<List.size();i++)
	    {
	    	System.out.println("Elements at position :"+i+  "--" +List.get(i));
	    }
	}

}
