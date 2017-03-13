
import java.util.Date;

public class checkFreeMemory {

	public static void main(String[] args) {
		
		Runtime rt = Runtime.getRuntime();
		
		System.out.println("Total memory: "+rt.totalMemory());
		System.out.println("Free memory: "+rt.freeMemory());
		
		Date d1 = null;
		
		for(int i=0; i < 1000; i++ ){
			d1 = new Date();
			d1 = null;
		}
		
		rt.gc();
		
		System.out.println("Total memory: "+rt.totalMemory());
		System.out.println("Free memory: "+rt.freeMemory());
		//xyz

	}

}
