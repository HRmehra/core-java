package core;

class ageval extends Exception{
	ageval(String S)
	{
		super(S);
	}
}
	

public class thoww {
	public static void main(String args[]) throws ageval {
		throw new ageval("invalid ");
	}
}