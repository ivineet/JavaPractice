package july_18;

import java.util.Arrays;


public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] values1 = new int[]{1,2,3,4,18,34,1,23,11,90};
		
		int ind = Arrays.binarySearch(values1, 18);
		
		System.out.print(values1[ind]);
	}
}

