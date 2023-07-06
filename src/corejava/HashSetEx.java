package corejava;
import java.util.*;

public class HashSetEx {

	public static void main(String[] args) {
		//To store heterogenous data
    HashSet hs = new HashSet();
    
  //mentioning the memory while creating hashset
    HashSet hs1 = new HashSet(100);
    
  //Mentioning the memory and the fill ratio
    HashSet hs2 = new HashSet(100,(float)0.95);
	
	
	//Homogenous Hashset
	HashSet<Integer> hs3 = new HashSet<Integer>();
	
//methods
	hs.add(10);
	hs.add("JAT");
	hs.add(null);
	hs.add(true);
	System.out.println(hs);
	
	//removing
	hs.remove(10);
	System.out.println("After removing--"+hs);
	
	
	//add all
	hs1.addAll(hs);
	System.out.println("After adding all function--"+hs1);
	
	//remove all
	hs1.removeAll(hs);
	System.out.println("After removing all function--"+hs1);
	
	//contains
	System.out.println("Contains method---"+hs.contains(true));
	
	//iteration
	for(Object coll:hs)
	{
		System.out.println(coll);
	}
	
	//conversion to do sort & shuffle
	 ArrayList al1 = new ArrayList(Arrays.asList(hs));
	 System.out.println(al1);
	 
	 Collections.sort(al1);
	 System.out.println("After sorting---"+al1);
	 
	 Collections.sort(al1,Collections.reverseOrder());
	 System.out.println("After reverse sorting---"+al1);
	 
	

}
}
