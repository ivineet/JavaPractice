package july_18;

import java.util.HashMap;

public class CheckKeyInHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Student> hmap = new HashMap<Integer, Student>();
		hmap.put(1, new Student(10, "test1", 20));
		hmap.put(2, new Student(2, "test2", 18));
		hmap.put(3, new Student(223, "Chaitanya", 26));
		hmap.put(4, new Student(245, "Rahul", 24));
		hmap.put(5, new Student(209, "Ajeet", 32));
		
		System.out.print(hmap.containsKey(5));

	}

}
