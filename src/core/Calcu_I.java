package core;

import java.util.Scanner;

interface face{
	void add(int a,int b);
	void sub(int a, int b);
	
	}

public class Calcu_I implements face {
	static int a;
	static int b;
	
	
	public void add(int a ,int b) {
		
		System.out.println(a+b);
	}
	
	public void add(double a, double b) {
		System.out.println(a+b);
	}
	
	public void sub(int a, int b) {
		System.out.println(a-b);
	}

	public void sub(double a, double b) {
		System.out.println(a-b);
	}
	
	public static void main(String args[]) {
		Calcu_I c1 = new Calcu_I();
		
		System.out.println("Select an operator +  or - ");
		
		Scanner s1 =  new Scanner(System.in);
		
		char operator = s1.next().charAt(0);
		
		System.out.println("enter the operand numbers");
		
		a=s1.nextInt();
		b=s1.nextInt();
		//a=s1.nextDouble();
		
		
		switch(operator) {
		case '+':
			c1.add(a,b);
			break;
			
		case '-':
			c1.sub(a,b);
			break;
			
		default :
			System.out.println("enter a valid operator");
		}
		
	}
}
