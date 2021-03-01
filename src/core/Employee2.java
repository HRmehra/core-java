package core;

import java.util.Scanner;

public class Employee2 {
	static int sall;
	static int hr;
	
	public void getinfo(int sal , int no_hr) {
		sall=sal;
		hr=no_hr;
		
	}
	public int addsal() {
		if (sall<50000) {
			sall = sall+10000;
		}
		return sall;
		
	}
	public int addwork() {
		if (hr>6) {
			sall=sall+5000;
			}
		return sall;
	
	}
	public static void main(String[] args) {
		Employee2 e1 =new Employee2();
		Scanner s1 =new Scanner(System.in);
		e1.getinfo(40000,7);
		e1.addsal();
		e1.addwork();
		System.out.println(sall);
		
	}

}
