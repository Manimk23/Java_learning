package corejava;
import java.util.*;
//default memory size is 10

public class ArrayLisrEx {

	public static void main(String[] args) {
      ArrayList al = new ArrayList();
      //for strings
      ArrayList<String> a1 = new ArrayList<String>();
      
      //for integer
      ArrayList<Integer> a2 = new ArrayList<Integer>();
   // 4th way of creating ArrayList
   		List al4 = new ArrayList();
      
      al.add("java");
      al.add("software");
      al.add("Automatic");
      al.add("Testing");
      System.out.println(al);
      
      System.out.println(al.size());
      
      al.remove(0);
      System.out.println("after removing--"+al);
      
      al.add(0, "JAT");
      System.out.println("After adding---"+al);
      
      al.set(0,"Guvi");
      System.out.println("After replacing---"+al);
      
      System.out.println(al.contains("Guvi"));
      
      System.out.println(al.isEmpty());
      
      //1st way of iteration
      for (int i=0;i<al.size();i++)
      {
    	  System.out.println(al.get(i));
      }
      System.out.println("----------------------");
      
      //2nd way )forEach)
      for(Object coll:al)
      {
    	  System.out.println(coll);
      }
      System.out.println("----------------------");
      
      //3rd way using iterators
      Iterator it = al.iterator();
      while(it.hasNext())
      {
    	  System.out.println(it.next());
      }
      
	}
 
}
