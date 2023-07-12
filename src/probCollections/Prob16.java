package probCollections;

import java.util.ArrayList;
import java.util.Arrays;

public class Prob16 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList (Arrays.asList(1,2,3,4));
		System.out.println("Actual list--"+al);
		al.clear();
		System.out.println("After clearing--"+al);

	}

}
