package core;

public class Sbuffer1 {
	public static StringBuilder Concate() {
		StringBuilder t=new StringBuilder("new");
		for (int i=0;i<=10000;i++) { 
			t=t.append("class");
		}
		return t;
	}
	
	public static StringBuffer concate2() {
		StringBuffer t =new StringBuffer("new");
		for (int i=0;i<=10000;i++) {
			t=t.append("class");
		}
		return t;
		
	}
	
	public static void main(String args[]) {
		Sbuffer1 o1 =new Sbuffer1();
		long z = System.currentTimeMillis();
		o1.Concate();
		
		System.out.println(System.currentTimeMillis()-z);
		long x = System.currentTimeMillis();
		o1.concate2();
		System.out.println(System.currentTimeMillis()-x);
	}

}
