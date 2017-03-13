
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder("Hi");
		System.out.println(sb);
		
		sb = null; 
		// setting instance to null make object eligible for garbage collection
		
		
		//Reassigning a Reference variable
		StringBuilder s1 = new StringBuilder("s1");
		StringBuilder s2 = new StringBuilder("s2");
		
		s1 = s2;
		//Now StringBuilder("s1"); is eligible for garbage collection
		

		//test

	}

}
