package hashsetprob;

import java.util.*;

public class Prob11 {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
	    hs.add(8);
	    hs.add(10);
	    hs.add(11);
	    hs.add(9);
	    
	    TreeSet ts = new TreeSet(hs);
	   
	    
	    System.out.println("HashSet:"+hs);
	    System.out.println("TreeSet:"+ts);
	    
	}

}
