package hashsetprob;

import java.util.HashSet;

public class Prob9 {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
	    hs.add(1);
	    hs.add(2);
	    hs.add(3);
	    hs.add(4);
	    
	    HashSet hs1 = new HashSet();
	    hs1.add(3);
	    hs1.add(4);
	    hs1.add(5);
	    hs1.add(6);
	    boolean retained = hs.retainAll(hs1);
        System.out.println("On comparing two sets and retaining: " + retained);
        System.out.println("Retained elements in hs: " + hs);
	}

}
