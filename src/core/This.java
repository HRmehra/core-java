package core;

public class This {
	
	int rollno;
	String name;
	String college_name;
	
	public  This(int rollno , String name ,String college_name){
		this.rollno=rollno;
		this.name=name;
		this.college_name=college_name;
		
	}
	void display() {
		System.out.println(rollno+" "+name+" "+college_name);
	}
	public static void main (String args[]) {
		This t1 =new This(123,"name","asdas");
		
		t1.display();
		
		
	}

}
