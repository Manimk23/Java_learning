package com.guvi.pack1;
//To access a package, we need to use import statement.
//import packagename with no change in directory structure
//import a specific class from a package
//to import all the classes and interfaces in the package, use * with the package name. It wont import the subpackages inside this package
import com.guvi.pack.*;
import com.guvi.pack.Hello1;
import com.guvi.pack.*;
import com.guvi.pack1subpack.*;

public class mergingAllPacakages {

	public static void main(String[] args) {
     Hello1 hl = new Hello1();
     hl.display();
     
    Hello2 h2 = new Hello2();
    h2.display1();
    
    com.guvi.pack.Hello1 obj = new com.guvi.pack.Hello1();
    obj.display();
    
    Hello3 h3 = new Hello3();
    h3.message();
     
	}


}
