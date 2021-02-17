package core;

import java.util.Scanner;

public class Matchstick {
	
	public  static void main(String args[]) {
		
		Scanner a =new Scanner(System.in);
		int n3 ,n2=1 ,n1=0;
		
		
		for(int i=2;i<20;i++) {
			n3 =a.nextInt();
			
		n3=n2+n1;
		System.out.println(n3);
		n1=n2;
		n2=n3;
		
			}
		}
	}

	