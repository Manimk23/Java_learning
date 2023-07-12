package corejava;
//not allows null key/value 
import java.util.*;
import java.util.Map.Entry;


public class TreeMapEx {

	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap();
	    
		tm.put(4, "a");
		tm.put(2, "b");
		tm.put(3, "c");
		tm.put(1, "d");
		tm.put(5, "e");
	    
	    System.out.println(tm);
	    
	    tm.remove(5);
	    System.out.println("After removing--"+tm);
	    
	    System.out.println("getting key--"+tm.get(2));
	    
	    System.out.println("contains key 3--"+tm.containsKey(3));
	    
	    System.out.println("contains value E--"+tm.containsValue("e"));
	    
	    System.out.println("key set--"+tm.keySet());
	    
	    System.out.println("values--"+tm.values());
	    
	    System.out.println("entry set--"+tm.entrySet());
	    
	    System.out.println("-----");
	    
	    for(Map.Entry eachEntry : tm.entrySet())
	    {
	    	System.out.println(eachEntry.getKey()+"="+eachEntry.getValue());
	    }
	    System.out.println("-----");
	    
	    Set s = tm.entrySet();
	    
	    Iterator itr = s.iterator();
	    while(itr.hasNext())
	    {
	    	Map.Entry entry= (Entry) itr.next();
	    	System.out.println(entry.getKey()+"="+entry.getValue());
	    	
	    	
	    	
	    		
	    }
	    
	    
	    
		}

	

	}



