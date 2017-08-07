package vlset_mock_v;

class Base1{
	
	public int getNext(int i) {
		return ++i;
	}
}

class Derived1 extends Base1{
	public int getNext(int i) {
		return i++;
	}
}

public class Lset6 extends Base {

	public static void main(String[] args) {
		Base1 b = new Base1();
		int result = b.getNext(3);
		System.out.print(result);
		
		Derived1 d = new Derived1(); 
		result = d.getNext(3);
		System.out.print(result);
	
	}

}
