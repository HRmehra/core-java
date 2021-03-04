package core;

import java.util.PriorityQueue;

public class Queuee {
	public static void main(String args[]) {
		PriorityQueue<Integer> pq =new PriorityQueue<Integer>();
		pq.add(1);
		pq.add(2);
		pq.add(3);
		pq.add(4);
		pq.add(5);
		
		
		System.out.println(pq);
		pq.remove(2);
		pq.poll();
		System.out.println(pq);
		
	}

}
