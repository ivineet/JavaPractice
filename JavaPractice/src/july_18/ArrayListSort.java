package july_18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Comparator;

//Comparator usage
public class ArrayListSort {
	public static void main(String[] args){
		ArrayList<Student> sList = new ArrayList<Student>();
		sList.add(new Student(10, "test1", 20));
		sList.add(new Student(2, "test2", 18));
		sList.add(new Student(223, "Chaitanya", 26));
		sList.add(new Student(245, "Rahul", 24));
		sList.add(new Student(209, "Ajeet", 32));
		
		//Collections.sort(sList);
		
		/*Iterator<Student> itr = sList.iterator();
		
		while(itr.hasNext()){
			System.out.print(itr.next().getRollno()+"  ");
		}
		*/
		Collections.sort(sList, Student.stRollno);
		
		for(Student st:sList){
			System.out.print(st+"  ");
		}
		
	}

}
