package core;

public class operators {
	public static void main(String args[])
	{
		int va =5;
		System.out.println(va);
		System.out.println(va++);
		System.out.println(++va);
		System.out.println(va--);
		System.out.println(--va);
		
		int a =10;
		int b=10;
		System.out.println(a++ + ++b);
		System.out.println(b++ + b++);
		
		System.out.println(a+b);
		System.out.println(a*b);
		System.out.println(a-b);
		System.out.println(a/b);
		
		System.out.println("right shift");
		System.out.println(10>>2);
		System.out.println("left shift");
		System.out.println(10<<2);
		
		int c = 10;
		int d =12 ;
		int e = 14;
		System.out.println(c<d&&c<e);
		System.out.println(c<d&c>e);
		
		int x = 10 ;
		int y = 5 ;
		int z = 20;
		
		System.out.println(x<y&&x++<z);
		System.out.println(x);
		
		int j = 2;
		int k = 5;
		int min=(j<k)?j:k;
		System.out.println(min);
		
		
		
	}

}
