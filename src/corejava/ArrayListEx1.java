package corejava;
import java.util.*;

public class ArrayListEx1 {

	public static void main(String[] args) {
    ArrayList<String> al = new ArrayList<String> ();
    
    ArrayList<String> al1 = new ArrayList<String> ();
    
    al.add("A");
    al.add("B");
    al.add("c");
    al.add("D");
    al1.addAll(al);
    System.out.println("After adding all"+al1); 
    
    al1.removeAll(al);
    System.out.println("After removing  all"+al1);
    
    al1.retainAll(al);
    System.out.println("After retaining  all"+al1);
    
	//we dont have predefined methods in arraylist, we can use the predefined methods in Collections class to sort, shuffle
    Collections.sort(al);
    System.out.println("After sorting"+al);
    
    Collections.sort(al,Collections.reverseOrder());
    System.out.println("After reverse sorting"+al);
    
    
    Collections.shuffle(al);
    System.out.println("After shuffling"+al);
    
    };

}
