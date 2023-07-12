package probCollections;

import java.util.ArrayList;

public class ArrayListprob3 {

	public static void main(String[] args) {
		 ArrayList<String>al = new ArrayList<String>();
	     al.add("Red");
	     al.add("blue");
	     al.add("green");
	     al.add("voilet");
	     System.out.println("Before inserting--"+al);
	     al.add(0, "Blue");
	     System.out.println("After inserting--"+al);

	}

}
