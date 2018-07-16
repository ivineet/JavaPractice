package july_18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
public class ArrayList1 {

	public static void main(String[] args) {
		String citynames[]={"Agra", "Mysore", "Chandigarh", "Bhopal"};
		
		ArrayList<String> loc = new ArrayList<String>(Arrays.asList(citynames)){{
			add("Delhi");
			   add("Agra");
			   add("Chennai");}
		};
		
		Collections.addAll(loc, citynames);
		
		loc.add("Vin");
		loc.add("KKm");
		loc.add("Abb");
		
		for(String list1:loc){
			System.out.print(list1 + " ");
			
		}
		
		
		System.out.println("last element");
		
		if(loc != null && !loc.isEmpty()){
			System.out.print(loc.get(loc.size()-1));
		}
		
	}

}
