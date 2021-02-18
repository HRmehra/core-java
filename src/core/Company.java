package core;

public class Company {
	int strength;
	int c_no;
	String name;
	
	public Company(int s ,int o,String n) {
		strength=s;
		name=n;
		c_no=o;
		
		
	}
	public void display() {
		 System.out.println(strength);
		 System.out.println(name);
		 System.out.println(c_no);
		 
		
	}
	public static void main(String args[]) {
		
		 Company c1 =new Company(23,12, "oceaca");
		 
		 c1.display();
	}

}
