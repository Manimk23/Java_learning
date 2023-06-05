package prog;

public class StringBufferEx {

	public static void main(String[] args) {
		StringBuffer sbb = new StringBuffer("Hi Tester");
		System.out.println(sbb);
		
		StringBuffer sbb1 = new StringBuffer("Hi java Tester");
		sbb1.append("great job");
		System.out.println(sbb1);
		
		StringBuffer sbb2 = new StringBuffer("Hi java Tester");
		sbb2.append("great job");
		sbb2.append("you are doing");
		System.out.println(sbb2);
		
		// other methods
		sbb2.insert(2, false);
		System.out.println(sbb2);
		
		sbb2.delete(2, 7);
		System.out.println(sbb2);
		
		sbb2.replace(0, 2, "All");
		System.out.println(sbb2);
		
		sbb2.reverse();
		System.out.println(sbb2);
		
		String sub = sbb2.substring(0,5);
		System.out.println(sub);
		
		String sub1 = sbb2.substring(5);
		System.out.println(sub1);
		
		char ch = sbb1.charAt(5);
		System.out.println(ch);
		
		System.out.println(sbb1.length());
		
		StringBuffer sbb4= new StringBuffer();
		System.out.println("Default capacity-->"+sbb4.capacity());
		sbb4.append("Hello");
		System.out.println("Capacity after appending Hello-->"+sbb4.capacity());
		sbb4.append("java is my favorite language");
		System.out.println("After inserting characters more than 16-->"+sbb4.capacity());
		
		// ensure capacity
		sbb4.ensureCapacity(15);
		System.out.println("checking the capacity when the minimumcapacity (15) < current capacity (34)-->"+sbb4.capacity());
		
		
		
		sbb4.ensureCapacity(50);
		System.out.println("Checking the capacity when the minimum capacity(50) > current capacity(34)-->"+sbb4.capacity());
		

/*
 * new capacity = (old capacity *2) +2;
 * newcapacity= (16*2)+2 = 32 +2 =34
 * 
 */
		
		
		

	}

}
