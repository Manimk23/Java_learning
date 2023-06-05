package assignments;

public class ReverseStringWithoutmethod {

	public static void main(String[] args) {
		String name = "Manikandan";
		String reverse="";
		int slength=name.length();
		for (int i=slength-1;i>=0; i--)
		{
			reverse = reverse+name.charAt(i);
		}
		System.out.println(reverse);
		

	}

}
