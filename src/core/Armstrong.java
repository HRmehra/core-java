package core;

public class Armstrong {
	public static void main(String args[])
	{
		int a,b=0;
		int num =153;
		int val=num;
		while(val>0)
		{
			a=val%10;
			val=val/10;
			b=b+(a*a*a);
			
		}
		if (num==b){
			System.out.println("arm is Strong");
			
			
		}
		else {
			System.out.println("arm is not Strong");
		}
	}

}
