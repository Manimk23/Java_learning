package assignments;

public class AirthmeticOperations 
{
	
	
	public  int addition(int num1, int num2) {
        return num1 + num2;
    }

    public  int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public  int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public  int division(int num1, int num2) {
        return num1 / num2;
    }

    public  int modulus(int num1, int num2) {
        return num1 % num2;
    }
    
    public static void main(String args[])
    {
    	AirthmeticOperations obj1 = new AirthmeticOperations();
    	int add =obj1.addition(5, 10);
    	System.out.println("The addition of two no is " +add);
    	
    	AirthmeticOperations obj2 = new AirthmeticOperations();
    	int sub =obj2.subtraction(10, 5);
    	System.out.println("The Subtraction of two no is " +sub);
    	
    	AirthmeticOperations obj3 = new AirthmeticOperations();
    	int mult =obj3.multiplication(10, 5);
    	System.out.println("The multiplication of two no is " +mult);
    	
    	AirthmeticOperations obj4 = new AirthmeticOperations();
    	int Div =obj4.division(10, 5);
    	System.out.println("The division of two no is " +Div);
    	

    	AirthmeticOperations obj5 = new AirthmeticOperations();
    	int mod =obj5.modulus(15, 5);
    	System.out.println("The modulus of two no is " +mod);
    	
    	
    }
  	
	  
	  
		
	}



