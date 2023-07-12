package TreeSet;

import java.util.TreeSet;

public class Prob3 {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		TreeSet ts1 = new TreeSet();

		ts.add("dog");
		ts.add("cat");
		ts.add("hen");
		ts.add("lion");
		ts1.addAll(ts);
		System.out.println("Adding all to anaother TreeSet--"+ts1);
	}

}
