package corejava;
import java.util.*;
// maintains insertion order , allows 1 null key / value
import java.util.Map.Entry;

public class LinkedHashMapEx {

	public static void main(String[] args) {
    LinkedHashMap<Integer, String> lhm = new LinkedHashMap();
    
    lhm.put(1, "a");
    lhm.put(2, "b");
    lhm.put(3, "c");
    lhm.put(4, "d");
    lhm.put(null, "e");
    
    System.out.println(lhm);
    
    lhm.remove(null);
    System.out.println("After removing--"+lhm);
    
    System.out.println("getting key--"+lhm.get(2));
    
    System.out.println("contains key 3--"+lhm.containsKey(3));
    
    System.out.println("contains value E--"+lhm.containsValue("e"));
    
    System.out.println("key set--"+lhm.keySet());
    
    System.out.println("values--"+lhm.values());
    
    System.out.println("entry set--"+lhm.entrySet());
    
    System.out.println("-----");
    
    for(Map.Entry eachEntry : lhm.entrySet())
    {
    	System.out.println(eachEntry.getKey()+"="+eachEntry.getValue());
    }
    System.out.println("-----");
    
    Set s = lhm.entrySet();
    
    Iterator itr = s.iterator();
    while(itr.hasNext())
    {
    	Map.Entry entry = (Entry) itr.next();
    	System.out.println(entry.getKey()+"="+entry.getValue());
    	
    	
    	
    		
    }
    
    
    
	}

}
