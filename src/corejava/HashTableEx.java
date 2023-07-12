package corejava;
import java.util.*;
//not able to create null key/ value it throws null exception
import java.util.Map.Entry;

public class HashTableEx {

	public static void main(String[] args) {
    Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
    ht.put(1, "A");
    ht.put(2, "b");
    ht.put(3, "c");
    ht.put(4, "d");
    ht.put(5, "e");
    System.out.println("the values are"+ht);
    
    System.out.println("getting --"+ht.get(1));
    
    System.out.println("contains key--"+ht.containsKey(1));
    
    System.out.println("contains--"+ht.contains("e"));
    
    System.out.println("key set--"+ht.keySet());
    
   System.out.println("values--+"+ht.values());
   
   System.out.println("entry set--"+ht.entrySet());
   
   for(Map.Entry eachEntry:ht.entrySet())
   {
	   System.out.println(eachEntry.getKey()+"=="+eachEntry.getValue());
   }
   
   System.out.println("--------");
    Set s = ht.entrySet();
    Iterator it = s.iterator();
    while (it.hasNext())
    {
    	Map.Entry entry= (Entry) it.next();
    	System.out.println(entry.getKey()+"=="+ entry.getValue());
    }
    
	}


}
