package probCollections;

import java.util.ArrayList;

public class Prob19 {

	public static void main(String[] args) {
		ArrayList<String>al = new ArrayList<String>();
	     al.add("Red");
	     al.add("blue");
	     al.add("green");
	     al.add("voilet");
	     al.set(1, "Ash");
	     for(int i =0;i<al.size();i++)
	     {
	    	 System.out.println("Elements at:"+i+"have the value:" + al.get(i));
	     }
	}

}
