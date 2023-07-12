package TreeSet;

import java.util.TreeSet;

public class Prob9 {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add("dog");
		ts.add("cat");
		ts.add("hen");
		ts.add("lion");
		
		TreeSet ts1 = new TreeSet();
		ts1.add("dog");
		ts1.add("cat");
		ts1.add("hen");
		ts1.add("tiger");
		System.out.println(ts.containsAll(ts1));
		
		

}
}
