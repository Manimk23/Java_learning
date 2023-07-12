package TreeSet;

import java.util.Collections;
import java.util.TreeSet;

public class Prob4 {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		

		ts.add("dog");
		ts.add("cat");
		ts.add("hen");
		ts.add("lion");
		TreeSet reversed = new TreeSet(Collections.reverseOrder());
		reversed.addAll(ts);
		System.out.println("After reverse ordering--"+reversed);
		
	}

}
