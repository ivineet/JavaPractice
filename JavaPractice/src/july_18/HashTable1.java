package july_18;

import java.util.TreeMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
public class HashTable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> ht1 = new TreeMap<Integer, String>();
		ht1.put(1, "test1");
		ht1.put(8, "est1");
		ht1.put(3, "ertest1");
		
		Set st = ht1.entrySet();
		
		Iterator itr = st.iterator();
		
		while(itr.hasNext()){
			Map.Entry me = (Map.Entry) itr.next(); 
			System.out.println(me.getKey()+" : "+me.getValue());
		}
	}
}

