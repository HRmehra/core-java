package core;

import java.util.Scanner;

class calculator{
	
	
	public void add(int a,int b) {
		System.out.println(a+b);
		
	}
	public void sub(int a,int b) {
		System.out.println(a-b);
		
	}
	public void mul(int a,int b) {
		System.out.println(a*b);
		
	}
	public void div(int a,int b) {
		System.out.println(a/b);
	}
	
}

public class Calcula extends calculator {
	public static void main(String[] args) {
		int a;
		int b;
		Calcula c1 = new Calcula();
		
		System.out.println("Select an operator +  , -  ,* ,/");
		
		Scanner s1 =  new Scanner(System.in);
		
		char operator = s1.next().charAt(0);
		
		System.out.println("enter the operand numbers");
		
		a=s1.nextInt();
		b=s1.nextInt();
		
		switch(operator) {
		case '+':
			c1.add(a,b);
			break;
			
		case '-':
			c1.sub(a,b);
			break;
		case '*':
			c1.mul(a,b);
			break;
		case '/':
			c1.div(a,b);
			break;
		default :
			System.out.println("enter a valid operator");
		}
	}

}
