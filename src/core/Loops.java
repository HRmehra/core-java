package core;

public class Loops {
	public static void main(String args[])
	{
		
		for(int a=1;a<6;a++) 
		{
			for(int j=0;j<a;j++)
			{
			System.out.print("* ");
			
		}
			System.out.println();
	}
		
		
			for(int f=6;f>0;f--)
		{
			for(int g=0;g<f;g++)
			{
			System.out.print("* ");
			
		}
			System.out.println();
	}
			
		
		
		int d=1;
		while(d<=9) {
			System.out.print(d +" ");
			d++ ;
		}
		System.out.println("  ");

		int e=1;
		do {
			System.out.print(e +" ");
			e++ ;
		}
		while(e<=9); 
}
}