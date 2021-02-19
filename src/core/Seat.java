package core;

	 class Car {
		public void  display1() {
		System.out.println("a car is a car");
		}

	}
	class Mirrors extends Car{
		public void  display2() {
			System.out.println("a car have a mirror");

		}
	}
		
	class Wheels extends Mirrors{
		public void  display3() {
			System.out.println("a car have  wheels");
		}
	}
	public class Seat extends Wheels{
		public static void main(String args[]) {
			Seat s1= new Seat();
			s1.display1();
			s1.display2();
			s1.display3();
			
		}
		

}
