//Declaring enumerations/
/*
 * Enums can be declared as their own separate class, or as a class member,	
 * however they must not be declared within a method!
 * 
 */

import java.lang.Enum;

enum CoffeeSize { SMALL, BIG } //enum outside class


class Coffee{
	
	CoffeeSize size;
}

public class Enum1 {
	
	 // semicolon is optional
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coffee drink = new Coffee();
		drink.size = CoffeeSize.SMALL;
		System.out.println(drink.size);

	}

}
