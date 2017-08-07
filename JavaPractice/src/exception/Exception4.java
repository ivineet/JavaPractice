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

class Super4 {
	void show() throws ArithmeticException {
		System.out.println("parent class");
	}
}

class Sub4 extends Super4 {
	//void show() throws Exception// InCorrect
	void show()// Correct
	{
		System.out.println("child class");
	}

}

public class Exception4 {
	public static void main(String[] args) /*throws Exception*/{
		
			Super4 s = new Sub4();
		try {
			s.show();
		} catch (Exception e) {
		}
	}
}

// output : child class
