package innerclasses;

public class Navel {
	private int size = 7;
	private static int length = 3;

	public static void main(String[] args) {
		new Navel().go();
	}

	void go() {
		int size = 5;
		System.out.println(new Gazer().adder());
	}

	class Gazer {
		int adder() {
			return size * length;
		}
	}
}


//Output : 21
//Explanation : The inner class Gazer has access to Navel's private static and private
//instance variables.
