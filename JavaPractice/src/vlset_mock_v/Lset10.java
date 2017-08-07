package vlset_mock_v;

public class Lset10 {
	
	void start() {
		long [] a1 = {3,4,5};
		long [] a2 = fix(a1);
		
		System.out.println(a1[0]+a1[1]+a1[2]);
		System.out.println(a2[0]+a2[1]+a2[2]);
		
	}
	
	long [] fix(long [] a3) {
		a3[1] = 10;
		System.out.println(a3);
		
		return a3;
	}

	public static void main(String[] args) {
		Lset10 l8 = new Lset10();
		l8.start();
		
	}

}
