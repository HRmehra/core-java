package core;
class Abcd{
	public String name;
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return(name);
	}
}
public class Getset extends Abcd{
	public static void main(String args[]) {
		Abcd a1 =new Abcd();
		a1.setName("raaaaj");
		System.out.println(a1.getName());
		
	}
	

}
