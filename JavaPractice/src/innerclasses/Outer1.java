package innerclasses;

//Inner class Example
public class Outer1 {
	private int ivar = 10;

	private class Inner { // inner class
		private int ivar = 20; // (could have an Inner() ctor)

		private void foo() {
			 // can access our regular inner ivar
			; // we can "see" our outer class automatically
			//Outer1.this.ivar = 13; // same as above
			System.out.println(ivar);
		}

		public String toString() {
			return "Beat Cal";
		}
	}

	public Object test() {
		ivar = 10;
		Inner in = new Inner();
		in.foo(); // can see things, even if private
		//in.toString(); // call an Object method
		return in;
		// Return pointer to inner to our caller as Object.
		// They can call toString() on it.
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer1 ou1 = new Outer1();
		System.out.println(ou1.test());

	}

}
