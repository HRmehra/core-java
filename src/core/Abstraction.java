package core;

abstract class Back{
	abstract void display();
}
public class Abstraction extends Back {
	public void display(){
		System.out.println("abstracted");
	}
	
	public static void main(String[] args) {
		Abstraction a1 =new Abstraction();
		a1.display();
	}
	

}
