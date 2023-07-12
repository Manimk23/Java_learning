package hashsetprob;

import java.util.HashSet;

public class Prob6 {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
	    hs.add(1);
	    hs.add(2);
	    hs.add(3);
	    hs.add(4);
	    HashSet cloned = new HashSet(hs);
	    System.out.println("clonned---"+cloned);
	}

}
