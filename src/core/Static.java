package core;

public class Static {
	int id;
	String name;
	static String comp_name= "oceana";
	
	public Static(int i , String n) {
		id=i;
		name=n;
		
		
		
	}
	void display()
	{
		System.out.println(id+" "+name+" "+comp_name);
	}
	public static void main(String args[]) {
		Static s1=new Static(123,"asdasd");
		s1.display();
	}

}
