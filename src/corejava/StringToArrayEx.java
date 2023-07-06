package corejava;

import java.util.Arrays;
import java.util.Iterator;
import java.util.ArrayList;

public class StringToArrayEx {

	public static void main(String[] args) {
    String arr  []= {"cat", "dog", "rat"};
    ArrayList al = new ArrayList(Arrays.asList(arr));
    System.out.println(al);
    
    Iterator it = al.iterator();
    		while(it.hasNext())
    		{
    			System.out.println(it.next());
    		}
    
    
	

}
}
