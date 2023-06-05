package prog;

public class ForEachex {

	public static void main(String[] args) {
		int[] marks = {90,80,70,60,50};
		//for (int i=0;i< marks.length; i++)
		//{
		//	System.out.println(marks[i]);
		//}
        // ForEach
		//Syntax
				//for (datatype var: collection(or)array)
		for (int mark:marks)
		{
			System.out.println(mark);
		}
	}

}
