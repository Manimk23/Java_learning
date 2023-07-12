package probCollections;

import java.util.ArrayList;
import java.util.Collections;

public class Prob12 {

	public static void main(String[] args) {
		ArrayList<String>al = new ArrayList<String>();
	     al.add("Red");
	     al.add("blue");
	     al.add("green");
	     al.add("voilet");
	     System.out.println("Before Swapping--"+al);
	     Collections.swap(al, 1, 3);
	     System.out.println("After swapping---"+al);
	}

}
