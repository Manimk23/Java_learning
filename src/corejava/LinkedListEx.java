package corejava;
import java.util.*;

public class LinkedListEx {

	public static void main(String[] args) {
    LinkedList <String>li = new LinkedList <String>();// homogenous
    LinkedList li1 = new LinkedList();
    LinkedList li2 = new LinkedList();
    li1.add("X");
    li1.add("Y");
    li1.add("Z");
    li1.add("A");
    System.out.println("after adding"+li1);
    
    System.out.println(li1.size());
    System.out.println("using get method"  +li1.get(0));
    
    li1.remove(1);
    System.out.println("after removing"+li1);
    
    li1.set(0, "JAT");
    System.out.println("after replacing"+li1);
    
    //itertaion
    //1st way
    for (int i=0;i<li1.size();i++)
    {
    	System.out.println(li1.get(i));
    }
    System.out.println("----------");
    
	
	//2nd way forEach
    for(Object coll:li1)
    {
  	  System.out.println(coll);
    }
    System.out.println("----------------------");
    
    //3rd way
    Iterator it = li1.iterator();
    while(it.hasNext())
    {
    	System.out.println(it.next());
    }
    
    li2.addAll(li1);
    System.out.println("After adding all " +li2);
    
    li2.removeAll(li1);
    System.out.println("After removing all "+li2);
    
    Collections.sort(li1);
    System.out.println("After sorting"+li1);
    
    Collections.sort(li1,Collections.reverseOrder());
    System.out.println("After reverse sorting "+li1);
    
    Collections.shuffle(li1);
    System.out.println("After shuffled"+li1);
   
    
	

}
}
