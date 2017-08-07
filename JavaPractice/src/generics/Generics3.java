package generics;

import java.util.List;
import java.util.ArrayList;

public class Generics3 {
	
	static List<String> list = new ArrayList<String>();
	static List list2;

	public static void main(String[] args) {
		list.add("vineet");
		list.add(1,"yadav");
		list.add(2,null);
		list.add(3,"yadav");
		//list.add(1);
		
		System.out.println(list);
		
		String r = list.get(0);
		
		list2 = new ArrayList();
		
		list2.add(r);
		
		
		System.out.println(r);
		System.out.println(list2);
		
		//System.out.println(list.isEmpty());
		//System.out.println(list.indexOf("vineet"));
		//System.out.println(list.indexOf(list));	
	}
}