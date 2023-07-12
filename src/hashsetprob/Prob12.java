package hashsetprob;

import java.util.Arrays;
import java.util.TreeSet;

public class Prob12 {

	public static void main(String[] args) {
		 TreeSet<Integer> ts = new TreeSet<>();
		 int[] val = {0,1,2,3,4,5,6,7};
		 for(int num : val )
		 {
			if(num<7) 
			{
				System.out.println(num);
			}
		 }
		 
	}

}
