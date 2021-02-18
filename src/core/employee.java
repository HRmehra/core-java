package core;

public class employee {
	int roll;
	String name;
	
	public void insert(int r , String n) {
		roll =r;
		name =n;
		
	
		
	}
	public void display() {
		System.out.println(roll);
		System.out.println(name);
	}

	public static void main(String args[]) {
		employee e1 =new employee();
		employee e2 =new employee();
		
		e1.roll=12;
		e1.name="ZBAA";
		e2.roll=123;
		e2.name="ABZ";
		
		e1.display();
		e2.display();	
		
	}
}
