package core;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Linkedlist {
	public static void main(String[] args) {
	LinkedList<Integer> list =new LinkedList<Integer>();
	
	list.add(123);
	list.add(234);
	list.add(12);
	
    //Iterator i=list.descendingIterator();  
    //while(i.hasNext())  
    //{  
      //  System.out.println(i.next());  
    //}  
	System.out.println(list);
    
    list.remove(2);
    list.addFirst(23);
    System.out.println(list);
    list.addLast(222);
    System.out.println(list);
    
    
	/*
	 * Iterator itr= list.iterator(); while (itr.hasNext()) {
	 * System.out.println(itr.next());
	 * 
	 * }
	 */
   
    
	}

}
