package core;

public class divisibility {

	public static void main(String args[])
	{
		for (int i=1;i<30;i++)
		{
			
			if(i%3==0 && i%5 ==0) {
				System.out.println("bus for "+i);
			}
			else if(i%5==0 && i%3 ==0) {
				System.out.println("car for "+i);
			}
			else if(i%3==0 && i%5==0);
				System.out.println("car & bus for "+i);
		}
	}
}
