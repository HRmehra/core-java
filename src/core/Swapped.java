package core;

public class Swapped {
	public static void main(String args[]) {
		int a=321;
		int b=123;
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("val of a "+a);
		System.out.println("val of b "+b);
	}

}
