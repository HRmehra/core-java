package core;
class AAbb{
	void display() {
		System.out.println("asdjhfbuhf");
	}
}

public class Demo extends AAbb {
	void display() {
		System.out.println("ascjhs d djhsd");
	}
	public static void main (String args[]) {
		Demo b =new Demo(); //static bindind
		AAbb a =new AAbb(); // static
		//Demo d1 =new AAbb(); //not valid
		AAbb a2 =new Demo(); //upercasting //dynamic casting
	}

}
