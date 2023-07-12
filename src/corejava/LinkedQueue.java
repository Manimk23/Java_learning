package corejava;
import java.util.*;

public class LinkedQueue {

	public static void main(String[] args) {
    LinkedList pq = new LinkedList();
    pq.add(2);
    pq.add(3);
    pq.add(4);
    pq.add(5);
    pq.add("a");
    System.out.println("Linked PQ--"+pq);
  //to fetch the head element . //A //It will throw NoSuchElement Exception
    System.out.println(pq.element());
    System.out.println(pq.peek());//A //It will throw Null
    
	//It will throw NoSuchElement Exception
    System.out.println(pq.remove());
	//It will return Null
    System.out.println(pq.poll());
    
    
	}

}
