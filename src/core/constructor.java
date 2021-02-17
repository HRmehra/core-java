package core;

public class constructor {
	int ab;
	public constructor(int a)
	{
	 ab=a;
		
	}
	public void display() {
		System.out.print(ab);
	}
	public static void main(String args[])
	{
		constructor c =new constructor(3);
		
		c.display();
		
	}

}
