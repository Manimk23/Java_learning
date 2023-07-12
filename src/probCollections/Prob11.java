package probCollections;

import java.util.ArrayList;
import java.util.Arrays;

public class Prob11 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList(Arrays.asList("red", "blue","green"));
		ArrayList al1 = new ArrayList(Arrays.asList("blue","green"));
		System.out.println(al.equals(al1));
	}

}
