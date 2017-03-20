/*
 * Declaring Constructors, Methods, and Variables in an enum
 *
 * Note: Every enum has a static method, values(), that returns an array of the enum's
 *       values in the order they're declared.
 * 
 */

enum CoffeeSize{ 
	SMALL(5), BIG(10), HUGE(15);
	
	CoffeeSize(int ounces){
		this.ounces = ounces;
	}
	
	private int ounces;
	
	public int getOunces(){
		return ounces;
	}
	
}

public class Enum2 {
	
	CoffeeSize size;

	
	public static void main(String[] args) {
		Enum2 drink1 = new Enum2();
		drink1.size = CoffeeSize.SMALL;
		
			System.out.println(drink1.size.getOunces());
		
		for(CoffeeSize cs: CoffeeSize.values()){
			System.out.println(cs + " " + cs.getOunces());
		}
		
		// TODO Auto-generated method stub

	}

}


/* You can NEVER invoke an enum constructor directly. The enum constructor
	is invoked automatically, with the arguments you define after the constant
	value. For example, BIG(8) invokes the CoffeeSize constructor that takes
	an int, passing the int literal 8 to the constructor. (Behind the scenes, of
	course, you can imagine that BIG is also passed to the constructor, but we
	don't have to know—or care—about the details.)
 */

