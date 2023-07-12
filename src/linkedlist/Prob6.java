package linkedlist;

import java.util.LinkedList;

public class Prob6 {

	public static void main(String[] args) {
		LinkedList<String> List = new LinkedList();
	    List.add("dog");
	    List.add("cat");
	    List.add("cow");
	    List.add("lion");
	    System.out.println("CurrentList--"+List);
	    List.add(0, "Cheetah");
	    System.out.println("After adding First--"+List);
	    List.add(5,"Elephnt");
	    System.out.println("After adding last--"+List);
	}

}
