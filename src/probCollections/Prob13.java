package probCollections;
import java.util.*;

public class Prob13 {

	public static void main(String[] args) {
    ArrayList list1 = new ArrayList (Arrays.asList(1,2,3,4));
    ArrayList list2 = new ArrayList (Arrays.asList(4,5,6,7));
    ArrayList joined = new ArrayList (list1);
    joined.addAll(list2);
    System.out.println("Joined the lists--"+joined);
    
	}

}
