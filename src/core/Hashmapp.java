package core;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hashmapp {
	public static void main(String args[]) {
		HashMap<Integer,String> h1 =new HashMap<>();
		
		h1.put(1,"one");
		h1.put(null,"asd");
		h1.put(2,"asd");
		h1.put(0,"adw");
		
		System.out.println(h1);
Set set =h1.entrySet();
		
		Iterator itr =set.iterator();
		
		while(itr.hasNext()) {
			Map.Entry en =(Map.Entry)itr.next();
			en.getKey();
			en.getValue();
		}

		System.out.println(h1);
	
	}
	
	

}
