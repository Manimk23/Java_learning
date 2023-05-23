package prog;

public class StringMethod {

	public static void main(String[] args) {
        String str="Happy";
        str=str.concat("Faces brings smile all the day");
        System.out.println(str);
        
        String str1=str.toUpperCase();
        System.out.println(str1);
        
        String str2=str.toLowerCase();
        System.out.println(str2);
        
        char str3= str.charAt(4);
        System.out.println(str3);
        
        String str4 = str.replace("a", "#");
        System.out.println(str4);
        
        String str5 = str.replace("day", "####");
        System.out.println(str5);
        
        boolean str6 = str.contains("Happy");
        System.out.println(str6);
        
        boolean str7 = str.contains("is");
        System.out.println(str7);
        
        String str8 ="";
        boolean emptystring=str8.isEmpty();
        System.out.println(emptystring);
        
        String str9 ="Vibe";
        String str10 ="VIbe";
        boolean equalString=str9.equals(str10);
        System.out.println("Equal-->"+equalString);
        
        boolean equalIgnoreString=str9.equalsIgnoreCase(str10);
        System.out.println("EqualsIgnoreCase-->"+equalIgnoreString);
        
        String str11= str.substring(2,10);
        System.out.println("substring is-->"+str11);
        

		//end index is exlusive and begining index is inclusive. It will print from 1 to 9
        String str12= str.substring(2);
        System.out.println("substring without end index is-->"+str12);
        
        int lengthOfstring= str9.length();
        System.out.println(lengthOfstring);
        
        int ch= str9.indexOf("b");
        System.out.println(ch);
        //new type
        String str13="  sixer";
        String trimmedstr14= str13.trim();
        System.out.println(trimmedstr14);
        
        String str15 ="Elon Musk";
        boolean startsWithElon = str15.startsWith("Elon");
        System.out.println(startsWithElon);
        
       
        boolean endsWithMusk = str15.endsWith("Musk");
        System.out.println(endsWithMusk);
        
        
        
        
        
        
        
        
        
        
        
	}

}
