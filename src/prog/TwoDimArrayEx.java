package prog;

public class TwoDimArrayEx {

	public static void main(String[] args) {
      int marks[][]={ 
    	           {25,26,27},
    		       {28,29,30},
    		       {31,32,33},
      };
      System.out.println("Size of an array is :" +marks.length);
      for (int i =0; i<marks.length; i++)
      {
    	  for (int j =0; j<marks.length; j++)
    	  {
    		  System.out.println(marks[i][j]);
    	  }
      }
	}

}
