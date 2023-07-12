package probCollections;

import java.util.ArrayList;
import java.util.Collections;

public class Prob9 {

	public static void main(String[] args) {
		ArrayList<String>al = new ArrayList<String>();
	     al.add("Red");
	     al.add("blue");
	     al.add("green");
	     al.add("voilet");
	     Collections.sort(al,Collections.reverseOrder());
	     System.out.println("After Reversing the order---"+al);
	}

}
