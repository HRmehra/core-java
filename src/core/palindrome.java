package core;

import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
	
		int rem , m=0 ;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number");
		int num =sc.nextInt();
		
		int n=num;
		while(num>0) {
			rem=num%10;
			m=(m*10)+rem;
			num=num/10;
			
		}
		if(n==m) {
			System.out.println("it is a palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
	
	}

}
