package corejava;
import java.util.*;

public class Prob1 {

	public static void main(String[] args) {
    int val []= {20,40,50,40,70,70,10,15};
    HashSet<Integer> uniqueValues = new HashSet();
    HashSet<Integer> repetitiveValues  = new HashSet();
    for (int num :val)
    {
    	if(!uniqueValues.add(num))
    	{
    		repetitiveValues.add(num);
    	}
    }
    System.out.println("Unique values:");
    for(int num:uniqueValues)
    {
    	System.out.println(num);
    }
    System.out.println("Repetitive values:");
    for (int num:repetitiveValues)
    {
    	System.out.println(num);
    }
	}

}
