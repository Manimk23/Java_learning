package hashsetprob;

import java.util.HashSet;

public class Prob10 {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
	    hs.add(1);
	    hs.add(2);
	    hs.add(3);
	    hs.add(4);
	    
	    hs.clear();
	    boolean isEmpty=hs.isEmpty();
	    System.out.println("is the list is empty---"+isEmpty);
	}

}
