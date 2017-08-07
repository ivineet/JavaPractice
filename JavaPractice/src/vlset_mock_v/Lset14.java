package vlset_mock_v;

class Base2{
	//private is key here
	private final void print1() {
		System.out.println("Base1");
	}
}

class Derived2 extends Base2{
	public final void print1() {
		System.out.println("Derived1");
	}
}

public class Lset14 {

	public static void main(String[] args) {
		new Derived2().print1();

	}

}
