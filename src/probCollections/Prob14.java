package probCollections;

import java.util.ArrayList;
import java.util.Arrays;

public class Prob14 {

	public static void main(String[] args) {
		ArrayList OG = new ArrayList (Arrays.asList(1,2,3,4));
		
	    ArrayList Cloned = new ArrayList (Arrays.asList(OG));
	    System.out.println("Original List--"+OG);
	    
	    System.out.println("Cloned List--"+Cloned);
	    
	}

}
