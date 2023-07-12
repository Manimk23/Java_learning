package TreeSet;

import java.util.TreeSet;

public class Prob11 {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet();
		ts.add(1);
		ts.add(3);
		ts.add(4);
		ts.add(5);
		ts.add(7);
		ts.add(9);
		ts.add(11);
		System.out.println("The no <= 8 :"+ts.headSet(8));
	}

}
