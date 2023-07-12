package hashsetprob;

import java.util.HashSet;

public class Prob8 {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
	    hs.add(1);
	    hs.add(2);
	    hs.add(3);
	    hs.add(4);
	    
	    HashSet hs1 = new HashSet();
	    hs.add(3);
	    hs.add(4);
	    hs.add(5);
	    hs.add(6);
	    System.out.println("on comparing two list--"+hs.contains(hs1));
	    
	}

}
