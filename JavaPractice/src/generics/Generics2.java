package generics;


import java.util.ArrayList;
class Test<T>{	
	private T obj;

	public Test(T obj){
		this.obj = obj;
	}
	
	public T getObj(){
		return this.obj;
	}
}


public class Generics2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		 
        al.add("Sachin");
        al.add("Rahul");
        al.add("Vineet"); // Compiler allows this
 
        String s1 = (String)al.get(0);
        String s2 = (String)al.get(1);
 
        // Causes Runtime Exception
        String s3 = al.get(2);
        System.out.print(s3);

	}
}
