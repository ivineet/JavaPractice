package vset;

class B {
	 public void method1(){
		 System.out.println("m 1");
	 }
	 
	 public void method2(){
		 System.out.println("B 1");
		 method1();// will override base function, 
	 }
} 

class A extends B {
	 public void method1(){
		System.out.println("A");
		super.method1();
	 }
	 
	 public void method2(){
		 System.out.println("A 2");
		 super.method2();
	 }
}


public class Inheritance1 {
	public static void main(String[] args){ 
		 A a = new A();
		 a.method2();
	 }
	//method overriding
	/* A2
	 * B 1
	 * A
	 * m 1
	 */
	 
}
