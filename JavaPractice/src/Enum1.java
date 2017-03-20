//Declaring enumerations/
/*
 * Enums can be declared as their own separate class, or as a class member,	
 * however they must not be declared within a method!
 * 
 */

import java.lang.Enum;

 //enum outside class


class Coffee{
	
	enum CoffeeSize { SMALL, BIG } //enum inside class
	
	CoffeeSize size;
}

public class Enum1 {
	
	 // semicolon is optional
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coffee drink = new Coffee();
		drink.size = Coffee.CoffeeSize.SMALL;  //enclosing class name reuired
		System.out.println(drink.size);

	}

}
