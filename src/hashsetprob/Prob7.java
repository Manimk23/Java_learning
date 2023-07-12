package hashsetprob;

import java.util.Arrays;
import java.util.HashSet;

public class Prob7 {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
	    hs.add(1);
	    hs.add(2);
	    hs.add(3);
	    hs.add(4);
	    HashSet conversion = new HashSet(Arrays.asList(hs));
	    System.out.println("After conversion"+conversion);
	}

}
