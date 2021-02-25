package core;

public class Eprop {
	void a() throws ArithmeticException  {
		int a=1/0;
		//throw new Exception("ArithmeticException");
	}
	void b()  throws ArithmeticException{
		a();
	}
	void c()  throws ArithmeticException{
		b();
	}
	public static void main(String args[]) throws ArithmeticException {
		Eprop e1 =new Eprop();
		try {
		e1.c();
	}
		catch (ArithmeticException e) {
			System.out.println(e);
		}
	}

}
