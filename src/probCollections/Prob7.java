package probCollections;

import java.util.ArrayList;

public class Prob7 {

	public static void main(String[] args) {
		ArrayList<String>al = new ArrayList<String>();
		ArrayList<String>al1 = new ArrayList<String>();
	     al.add("Red");
	     al.add("blue");
	     al.add("green");
	     al.add("voilet");
	     al1.addAll(al);
	     System.out.println("After copying the elements"+al1);
	}

}
