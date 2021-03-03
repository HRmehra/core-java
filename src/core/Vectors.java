package core;
import java.util.*;

public class Vectors {
	public static void main(String args[]) {
		Vector<Integer> v1 =new Vector<Integer>();
		v1.add(12);
		v1.add(100);
		v1.add(200);
		v1.add(300);
		v1.add(400);
		v1.add(500);
		System.out.println(v1);
		
		System.out.println("size is"+v1.size());
		
		System.out.println("capacity is "+v1.capacity());
		
		System.out.println(v1.contains(12));
		
		//System.out.println(v1.clone());
		System.out.println(v1.firstElement());
		
		System.out.println(v1.get(2));
		
		v1.insertElementAt(12,2);
		System.out.println(v1);
		
		System.out.println(v1.lastIndexOf(12));
		
		Collections.replaceAll(v1,12,20);

		System.out.println(v1);
		
		//Collections.sort(v1);
		//System.out.println(v1);
		
		
		
		
		
		
	}

}
