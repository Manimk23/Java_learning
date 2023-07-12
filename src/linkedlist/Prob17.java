package linkedlist;

import java.util.Arrays;
import java.util.*;

public class Prob17 {

	public static void main(String[] args) {
    LinkedList li = new LinkedList(Arrays.asList("a","b","c","d"));
    LinkedList li1 = new LinkedList(Arrays.asList("e","f","g","h"));
    LinkedList joined = new LinkedList(li);
    joined.addAll(li1);
    System.out.println("joined list--"+joined);
    
	}

}
