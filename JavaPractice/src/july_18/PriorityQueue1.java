package july_18;

import java.util.Comparator;
import java.util.PriorityQueue;


class MyComparator implements Comparator<String>{
	public int compare(String s1, String s2){
		return s1.length() - s2.length();
		
	}
}

public class PriorityQueue1 {

	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<String>(15, new MyComparator());
		pq.add("Abbbb");
		pq.add("ddd");
		pq.add("hhhhhhh");
		
		while(!pq.isEmpty()){
			System.out.println(pq.poll());
		}
		// TODO Auto-generated method stub

	}

}
