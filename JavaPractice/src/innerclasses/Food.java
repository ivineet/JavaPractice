package innerclasses;

interface Cookable {
	public void cook();
}

class Food {
	Cookable c = new Cookable() {
		public void cook() {
			System.out.println("anonymous cookable implementer");
		}
	};
	
}


/*

Don't be  attempts to instantiate an interface except in the
case of an anonymous inner class. The following is not legal,

Runnable r = new Runnable(); // can't instantiate interface

whereas the following is legal, because it's instantiating an implementer of the
Runnable interface (an anonymous implementation class):

Runnable r = new Runnable() { // curly brace, not semicolon
public void run() {
 }
};

*/