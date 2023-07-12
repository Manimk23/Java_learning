package hashsetprob;

import java.util.HashSet;

public class Prob5 {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
	    hs.add(1);
	    hs.add(2);
	    hs.add(3);
	    hs.add(4);
	    System.out.println("Actual list--"+hs);
	    System.out.println("After check--"+hs.isEmpty());
	}

}
