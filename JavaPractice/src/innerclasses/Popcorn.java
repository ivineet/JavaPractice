package innerclasses;

//creates an anonymous subclass of the specified class type
class Popcorn {
	public void pop() {
		System.out.println("popcorn");
	}
}

class Food1 {
	Popcorn p = new Popcorn() {
		public void pop() {
			System.out.println("anonymous popcorn");
		}
	};
	
	
}
