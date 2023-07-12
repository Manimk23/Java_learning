package corejava;
import java.util.*;
import java.util.Map.Entry;

public class HashMapEx {

	public static void main(String[] args) {
    HashMap hm = new HashMap();
    
    HashMap<Integer, String> hm1 = new HashMap<Integer, String>();
    
    HashMap hm2 = new HashMap(100);
    
    HashMap hm3 = new HashMap(100,(float).90 );
    
    hm1.put(101, "a");
    hm1.put(102, "b");
    hm1.put(103, "c");
    hm1.put(104, "d");
    System.out.println(hm1);
    
    hm1.remove(102);
    System.out.println("After removing---"+hm1);
    
   
    System.out.println(hm1.get(104));
    
    System.out.println(hm1.containsKey(102));
    
    System.out.println(hm1.containsValue("a"));
    
    System.out.println(hm1.size());
    
    System.out.println(hm1.keySet());
    
    System.out.println(hm1.values());
    
    
    System.out.println(hm1.entrySet());
    
    for(Map.Entry eachEntry:hm1.entrySet())
    {
    	System.out.println(eachEntry.getKey()+ "---"+ eachEntry.getValue());
    }
    
    
	Set s= hm1.entrySet();
	
	Iterator itr= s.iterator();
	
	while(itr.hasNext())
	{
		Map.Entry entry= (Entry) itr.next();
		System.out.println(entry.getKey()+"-------"+entry.getValue());
	}	
    		
    
	}

}
