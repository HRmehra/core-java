package core;

import java.util.TreeSet;

public class Treee {
	public static void main(String args[]) {
		TreeSet<Integer> t1 =new TreeSet<Integer>();
		t1.add(23);
		t1.add(22);
		t1.add(10);
		t1.add(20);
		t1.add(15);
		t1.add(30);
		
		System.out.println(t1);
		
		System.out.println(t1.higher(22));
		
		System.out.println(t1.lower(22));
		
		System.out.println(t1.pollFirst());
		System.out.println(t1.pollLast());
		
		//System.out.println(t1.descendingSet());
		
		System.out.println(t1.first());
		System.out.println(t1.last());
		
		
	}

}
