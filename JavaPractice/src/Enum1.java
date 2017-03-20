//Declaring enumerations/
/*
 * Enums can be declared as their own separate class, or as a class member,	
 * however they must not be declared within a method!
 * 
 */

import java.lang.Enum;


public class Enum1 {
	
	enum CoffeeSize { SMALL, BIG } // semicolon is optional

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CoffeeSize cs = CoffeeSize.SMALL;
		
		System.out.println(cs);

	}

}
