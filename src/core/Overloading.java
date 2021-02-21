package core;

public class Overloading {
	
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	

	public void add(double a ,double b) {
		System.out.println(a+b);
	}
	
	public static void main (String args[]) {
		Overloading o1 = new Overloading();
		
		o1.add(4.2,4);
	}
}
