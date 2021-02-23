package core;

public class Strings {
	public static void main(String args[]) {
		String i ="azaad";
		String j ="musaafir";
		String z ="azaad";
		System.out.println(i.length());
		
		System.out.println(j.substring(0,4));
		
		System.out.println(i.isEmpty());
		
		System.out.println(i.equals(j));
		System.out.println(i.equals(z));
		
		String c=String.join("*","java","EE","SE");
		System.out.println(c);
		
		c=c.concat(" is concatinated");
		System.out.println(c);
		
		String e =c.replace('a','e');
		System.out.println(e);
		System.out.println(z.toUpperCase());  
		
		System.out.println(e.contains("about"));  
		
		
	}

}

