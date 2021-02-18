package core;

public class Statics1 {
	static int i;
	public Statics1(int k) {
		i=k;
		k++;
	}
	public void display() {
		System.out.println(i);
	}
	public static void main(System args[]) {
		Statics1 sa =new Statics1(1);
		Statics1 sb =new Statics1(i);
		Statics1 sc =new Statics1(i);
		sa.display();
		sb.display();
		sc.display();
	}
	

}
