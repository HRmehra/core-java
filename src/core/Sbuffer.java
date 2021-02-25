package core;

public class Sbuffer {
	public static void main(String args[]) {
		StringBuffer sq =new StringBuffer("java");
		sq.append("String");
		System.out.println(sq);
		sq.insert(0,"hi");
		System.out.println(sq);
		sq.replace(1,3," ");
		System.out.println(sq);
		sq.delete(1,3);
		System.out.println(sq);
		sq.reverse();
		System.out.println(sq);
		
		
	}

}
