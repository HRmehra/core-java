package core;
import java.util.*;

public class Arraylist {
	public static void main(String[] args) {
		List<Integer> list =new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		
	//for(Integer i:list) {
		//System.out.println(i);
		//}
		Iterator itr= list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		System.out.println(list.get(2));
	}

}
