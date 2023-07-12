package TreeSet;

import java.util.Collections;
import java.util.TreeSet;

public class Prob6 {

	public static void main(String[] args) {
      TreeSet ts = new TreeSet();
		ts.add("dog");
		ts.add("cat");
		ts.add("hen");
		ts.add("lion");
		TreeSet cloned = new TreeSet(ts);
		System.out.println("Cloned set--"+cloned);
	}

}
