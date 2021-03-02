package core;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		System.out.println("Enter the number to check if palindrome");
		Scanner s1 =new Scanner(System.in);
		int m =s1.nextInt();
		int i, n=0,flag=0;
		
		n=m/2;
		if (m==0||m==1) {
			System.out.println(m+"  is not prime number");
			
		}
		else {
			for(i=2;i<=n;i++) {
				
				if (n%i==0) {
					System.out.println(m+" is not a prime number");
					flag=1;
					break;
				}
			}
			if (flag==0) {
				System.out.println(m+"  is a prime prime number");
				
			}
		}
	
	
	}}