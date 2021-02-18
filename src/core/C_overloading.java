package core;

public class C_overloading {
	int age ;
	String name;
	String comp_name;
	int id;
	
	public C_overloading(int a,String b, String c) {
		age=a;
		name=b;
		comp_name=c;
	}
	public C_overloading(int d,String e, String f , int g) {
	
		age=d;
		name=e;
		comp_name=f;
		id=g;
	}
	public void display()
	{
		System.out.println(age+" "+name+" "+comp_name+" "+id);
	}
	
	public static void main (String args[]) {
		C_overloading c1= new C_overloading(1,"abz","oceana");
		C_overloading c2= new C_overloading(12,"zxc","oceaca",34);
		
		c1.display();
		c2.display();
				
		
	}
}
