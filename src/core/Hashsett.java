package core;
import java.util.*;
public class Hashsett {
	public static void main(String args[]) {
		HashSet<String> h1 =new HashSet<String>();
		h1.add("asd");
		h1.add("adasd");
		h1.add("kjg");
		h1.add("iufrdhj");
		
		System.out.println(h1);
		
		System.err.println(h1.size());
		
		h1.remove("asd");
		System.out.println(h1);
		
		//h1.clear();
		
		System.out.println(h1.isEmpty());
		
		h1.add("kjg");
		System.out.println(h1);
		
		
		
	}

}
