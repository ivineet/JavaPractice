package exception;

import java.io.*;
/*
 * If Super class method throws an exception, 
 * then Subclass overriden method can throw the same exception 
 * or no exception, but must not throw parent exception of the 
 * exception thrown by Super class method.

	It means, if Super class method throws object of NullPointerException 
	class, then Subclass method can either throw same exception, or can throw 
	no exception, but it can never throw object of Exception class 
	(parent of NullPointerException class).
 */

class Super2 {
	void show() throws Exception {
		System.out.println("parent class");
	}
}

class Sub2 extends Super2 {
	void show() throws Exception // Correct
	{
		System.out.println("child class");
	}

}

public class Exception2 {
	public static void main(String[] args) {
		try {
			Super2 s = new Sub2();
			s.show();
		} catch (Exception e) {
		}
	}
}

// output : child class
