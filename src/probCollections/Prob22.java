package probCollections;

import java.util.ArrayList;

public class Prob22 {

	public static void main(String[] args) {
		ArrayList<String>al = new ArrayList<String>();
	     al.add("Red");
	     al.add("blue");
	     al.add("green");
	     al.add("voilet");
	     System.out.println("Actual capacity--"+al.size());
	     al.trimToSize();
	     System.out.println("New Capacity--"+al.size());
	}

}
