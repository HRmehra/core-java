package core;
import java.util.*;

public class LinkedHS {
	public static void main(String[] args) {
		LinkedHashSet<String> h1 =new LinkedHashSet<String>();
		
		h1.add("asd");
		h1.add("zxc");
		h1.add("asd");
		
		System.out.println(h1);
	}

}
