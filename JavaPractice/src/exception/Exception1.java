package exception;

import java.io.*;
/*when overriding a method with exception handling. 
 * If super class method does not declare any exception, 
 * then sub class overriden method cannot declare checked exception 
 * but it can declare unchecked exceptions
 */

class Super1 {
	void show() {
		System.out.println("parent class");
	}
}

class Sub1 extends Super1 {
	
	//void show() throws IOException // Compile time error , since checked exception
	void show() throws ArrayIndexOutOfBoundsException //umchecked exception
	{
		System.out.println("sub class");
	}
	
	/*
	 * Because ArrayIndexOutOfBoundsException is an unchecked exception hence, 
	 * overrided show() method can throw it
	 */
}

public class Exception1 {
	public static void main(String[] args) {
		Super1 s = new Sub1();
		s.show();
	}

}
