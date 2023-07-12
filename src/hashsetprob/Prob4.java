package hashsetprob;

import java.util.HashSet;

public class Prob4 {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
	    hs.add(1);
	    hs.add(2);
	    hs.add(3);
	    hs.add(4);
	    System.out.println("Actual list--"+hs);
	    hs.removeAll(hs);
	    System.out.println("Updated list--"+hs);
	}

}
