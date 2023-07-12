package linkedlist;


import java.util.LinkedList;

public class Prob4 {

	public static void main(String[] args) {
		LinkedList<String> List = new LinkedList();
	    List.add("dog");
	    List.add("cat");
	    List.add("cow");
	    List.add("lion");
	    for (int i=List.size()-1;i>=0;i--)
	    {
	    	System.out.println(List.get(i));
        }

	}

}
