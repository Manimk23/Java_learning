package TreeSet;

import java.util.TreeSet;

public class Prob15 {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet();
		ts.add(1);
		ts.add(3);
		ts.add(4);
		ts.add(5);
		ts.add(7);
		ts.add(9);
		ts.add(11);
		System.out.println("Retrieve & removing last element--"+ts.pollLast());
	}

}
