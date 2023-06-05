package prog;

public class StringBuilderEx {

	public static void main(String[] args) {
		//String Builder is an mutable (values are changeable) version of String class
		//the default no . of characters for STring builder is 16

		//first way of creating stringbuilder

		StringBuilder sb = new StringBuilder ("hello");
		sb.append("java");
		System.out.println(sb);

		//second way of creating stringbuilder
		StringBuilder sb1 = new StringBuilder ("hello");
		sb1.append("world");
		System.out.println(sb1);

		//Third way of creating Stringbuilder
		StringBuilder sb2 = new StringBuilder (20);
		sb2.append("world");
		sb2.append("Of lies");
		System.out.println(sb2);

		//other StringBuilder methods

		sb.insert(2, "ignores");
		System.out.println(sb);

		//beginindex is inclusive and the endindex is exlusive
		sb.delete(2, 9);
		System.out.println(sb);

		sb.replace(5, 9, "guys");
		System.out.println(sb);

		//reason to use variable as it is string and it is immutable
		String sub = sb.substring(0,5);
		System.out.println(sub);

		String sub1 = sb.substring(5);
		System.out.println(sub1);

		sb.reverse();
		System.out.println(sb);

		//reason to use variable as it is string and it is immutable
		char ch= sb.charAt(1);
		System.out.println(ch);

		StringBuilder sb4 = new StringBuilder();
		System.out.println(sb4.capacity());

		sb4.append("you are so greatful to be here my buddy");
		System.out.println(sb4.capacity());

		/*
		 * new capacity = (old capacity *2) +2;
		 * newcapacity= (16*2)+2 = 32 +2 =34
		 * 
		 */
		
		//ensureCapacity
				StringBuilder sb5= new StringBuilder();
				System.out.println("Default capacity in sb5-->"+sb5.capacity()); //16
				sb4.append("Hello");
				System.out.println("Capacity after appending Hello in sb5-->"+sb5.capacity()); //16
				sb5.append("java is my favorite language");
				System.out.println("After inserting characters more than 16 in sb5-->"+sb5.capacity()); //34
				
				sb5.ensureCapacity(15);
				System.out.println("checking the capacity when the minimumcapacity (15) < current capacity (34)-->"+sb5.capacity());
				
				
				
				sb5.ensureCapacity(50);
				System.out.println("Checking the capacity when the minimum capacity(50) > current capacity(34)-->"+sb5.capacity());
				
				/*
				 * new capacity = (old capacity *2) +2;
				 * newcapacity= (34*2)+2 =68 +2 =70
				 * 
				 */


	}

}
