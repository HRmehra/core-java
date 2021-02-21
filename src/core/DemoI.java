package core;

interface dis{
	void display();
}

public class DemoI implements dis {
	public void display() {
		System.out.println("Hello");
	}
	public static void main (String[] args) {
		DemoI d1 =new DemoI();
		d1.display();
	}
}
