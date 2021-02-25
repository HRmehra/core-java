package core;

public class Trycach {
	public static void main(String args[]) {
		int a[]=new int [1];
		try {
			a[0]=2/0;
		}
				catch( ArithmeticException e) {
				System.out.println(e);
				}
			catch(Exception e) {
				System.out.println(e);
			}

	}

}
