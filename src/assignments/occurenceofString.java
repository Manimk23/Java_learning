package assignments;

public class occurenceofString {

	public static void main(String[] args) {
		String str ="Happy Yippe";
		char ch ='p';
		int result =0;
		for (int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)==ch)
			{
				result++;
			}
		}
		System.out.println("The occurence for the"+ch+" has repeated "+result+"times");
		

	}

}
