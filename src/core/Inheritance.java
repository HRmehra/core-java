package core;

public class Inheritance {
	int add(int a , int b) {
		return(a+b);
	}

}
class Inheritance_two extends Inheritance{
	int sub(int c , int d) {
		return(c-d);
		
	}
	public static void main(String args[]) {
		Inheritance_two i1 =new Inheritance_two();
		Inheritance_two i2 =new Inheritance_two();
		
		int result1 =i1.add(2,5);
		int result2 =i2.sub(3,2);
		
		System.out.println(result1);
		System.out.println(result2);
		
	}
	
}

