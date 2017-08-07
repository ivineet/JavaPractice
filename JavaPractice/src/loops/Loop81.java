package loops;

public class Loop81 {

	public static void main(String[] args) {
		boolean b = false;
		int i = 1;
		
		do {
			i++;
		}while(b = !b);
			
		System.out.println(i);	
	}

}
