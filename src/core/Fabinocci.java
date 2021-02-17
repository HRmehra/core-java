package core;

public class Fabinocci {
	public static void main(String args[])
	
	{
		
		int n3 ,n2=1 ,n1=0;
		int itr =20;
		
		for(int i=2;i<itr;i++) {
			
		n3=n2+n1;
		System.out.println(n3);
		n1=n2;
		n2=n3;
		}
	}

}
