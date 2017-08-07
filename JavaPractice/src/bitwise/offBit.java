package bitwise;
public class offBit {
	
	public static int turnOff(int n, int k){
		//int m = (n & ~(n << (k-1)));
		//System.out.println(m);
		
		return (n & ~(n << (k-1)));
	}
	
	public static void main(String[] args){
		
		int k = 4, n = 18;
		n = n & 0x0F;
		int s = turnOff(15,k);
		
		System.out.println(s);
	}

}
