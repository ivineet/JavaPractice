package vlset_mock_v;

class A{
	int b = 10;
	
	A() {
		this.b = 7;
		System.out.println("A:"+b);
	}
	
	int f() {
		return b;
	}
	
	public void test() {
		System.out.println("test a:");
	}
}

class B extends A{
	int b;
	
	B() {
		//this.b = 10;
		System.out.println("B:"+b);
	}
	
	public void test(int c) {
		System.out.println("test b:");
	}
}

public class Lset2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new B();
		a.test();
		//a.test(110);

	}

}
