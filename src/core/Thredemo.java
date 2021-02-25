package core;

public class Thredemo extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

	public static void main(String args[]) {
		Thredemo t1 =new Thredemo();
		Thredemo t2 =new Thredemo();
		
		t1.start();
		t2.start();		
	}
	}
