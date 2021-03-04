package core;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Mapp {
	public static void main(String args[])
	{
		TreeMap<Integer,String> t1 = new TreeMap<>();
		
		t1.put(1,"one");
		t1.put(3,"two");
		t1.put(2,"three");
		t1.put(3,"four");
		
		Set set =t1.entrySet();
		
		Iterator itr =set.iterator();
		
		while(itr.hasNext()) {
			Map.Entry en =(Map.Entry)itr.next();
			en.getKey();
			en.getValue();
		}
		
		System.out.println(t1);
		

		
		System.out.println(t1.containsKey(2));
	}
}
