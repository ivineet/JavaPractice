package vlset_mock_v;

class Base{
	int x = 10;
	
	public void f1() {
		System.out.println("Base");	
	}
}

class Derived extends Base{
	int x = 20;
	
	public void f1() {
		System.out.println("Derived");	
	}
}

public class Lset5 extends Base {

	public static void main(String[] args) {
		Base b = new Base();
		Derived d = new Derived(); 
		Base bd = new Derived();
		
		System.out.println(b.x + " " + " " + d.x + " " + bd.x + " ");
		bd.f1();
		

	}

}
