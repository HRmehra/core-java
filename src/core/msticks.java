package core;

import java.util.Scanner;

public class msticks
{
	
	public static void main(String args[])
	{
		

				int comp=0;
		
			 
			Scanner sc =new Scanner (System.in);
			System.out.println("enter a number");
			
			int num =sc.nextInt();
				
					
			switch(num) 
			{
			case 1:num =1;
			comp=4;
			
			break ;
			
			case 2:num =2;
			comp=3;
			break ;
			
			case 3:num =3;
			comp=2;
			break ;
			
			case 4:num =4;
			comp=1;
			break ;
			
			default :
			System.out.println("user , enter a valid number");
				
		
			}
				
				
				System.out.println("comp ="+comp);
			
		}
}
			




