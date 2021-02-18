package core;

public class Area_rectangle {
	int l;
	int b;
	int c;
	public void area(int length ,int bredth) {
		l=length;
		b=bredth;
		c=length*bredth;
		
	}
	public void display() {
		System.out.print(c);
	}
	public static void main(String args[]) {
		Area_rectangle a1 =new Area_rectangle();
		
		a1.area(3,3);
		a1.display();
	}

}
