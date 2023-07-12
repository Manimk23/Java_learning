package TreeSet;

import java.util.TreeSet;

public class Prob5 {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add("dog");
		ts.add("cat");
		ts.add("hen");
		ts.add("lion");
		System.out.println("First element--"+ts.first());
		System.out.println("Last element--"+ts.last());
	}

}
