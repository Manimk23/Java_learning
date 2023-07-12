package probCollections;

import java.util.ArrayList;

public class ArrayListProb5 {

	public static void main(String[] args) {
		ArrayList<String>al = new ArrayList<String>();
	     al.add("Red");
	     al.add("blue");
	     al.add("green");
	     al.add("voilet");
	     System.out.println("Result for Red--"+al.contains("Red"));
	     System.out.println("Result for White--"+al.contains("White"));

	}

}
