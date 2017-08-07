package polymorphism;

class Popcorn {
	public void pop() {
		System.out.println("popcorn");
	}
}

class Food {
	Popcorn p = new Popcorn() {
		public void sizzle() {
			System.out.println("anonymous sizzling popcorn");
		}

		public void pop() {
			System.out.println("anonymous popcorn");
		}
	};

	public void popIt() {
		p.pop(); // OK, Popcorn has a pop() method
		//p.sizzle(); // Not Legal! Popcorn does not have sizzle()
	}
}

/*
 * Compiling the preceding code gives us something like, Anon.java:19: cannot
 * resolve symbol symbol : method sizzle ()
 */