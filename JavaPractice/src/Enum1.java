//Declaring enumerations/
/*
 * Enums can be declared as their own separate class, or as a class member,	
 * however they must not be declared within a method!
 * 
 */

import java.lang.Enum;

 /*
  * Note: 
  * 1. An enum can be declared outside or inside a class, but NOT in a method
  * 2. An enum declared outside a class must NOT be marked static, final,
	abstract, protected, or private.
  * 3. Enums can contain constructors, methods, variables, and constant class bodies.
  * 4. enum constants can send arguments to the enum constructor, using the
       syntax BIG(8), where the int literal 8 is passed to the enum constructor.
  * 5. enum constructors can have arguments, and can be overloaded
  * 6. enum constructors can NEVER be invoked directly in code. They are always
       called automatically when an enum is initialized.
  * 7. The semicolon at the end of an enum declaration is optional. These are legal:
		enum Foo { ONE, TWO, THREE}
		enum Foo { ONE, TWO, THREE};
  */


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
