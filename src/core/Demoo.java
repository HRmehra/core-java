package core;

public class Demoo {
	int a=5;
	void change(int a) {
		a=a+10;
	}
	public static void main(String args[]) {
		Demoo  d2 =new Demoo();
		System.out.println(d2.a);
		d2.change(5);
		System.out.println(d2.a);
		
	}

}
