package vset;

class Building {
	Building() {
		System.out.println("b ");
	}

	Building(String name) {
		this();
		System.out.println("bn " + name);
	}
}

class House extends Building {
	House() {
		super("a"); //will call parameterised super constructor
		System.out.println("h ");
	}

	House(String name) {
		// this();
		System.out.println("hn " + name);
	}
}

public class Inheritance2 {
	public static void main(String[] args) {
		new House();
	}
	/* b
	 * bn q
	 * h
	 */
}
