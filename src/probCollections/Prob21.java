package probCollections;

import java.util.ArrayList;

public class Prob21 {

	public static void main(String[] args) {
		ArrayList<String>al = new ArrayList<String>();
	     al.add("Red");
	     al.add("blue");
	     al.add("green");
	     al.add("voilet");
	     System.out.println("Actual--"+al);
	     al.add(0, "&&&");
	     System.out.println("Updated--"+al);
	}

}
