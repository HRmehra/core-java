package core;

class Bba{
	int a=10;
	Bba(){
		System.out.println("constructor of parent");
	}
	public void add(){
		System.out.println("this is of class Bba");
	}
}
 public class Overriding extends Bba {
	
	 int a = 5 ;
	 
	 public void add(){
		System.out.println("this is class Overriding");
		System.out.println(a);
		System.out.println(super.a);
		super.add();
	}
	Overriding(){
	super();
		
	}
	 
	
	public static void main(String args[]) {
		Overriding o1=new Overriding();
		o1.add();
		
	}

}
