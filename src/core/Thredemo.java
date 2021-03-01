package core;

public class Thredemo extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.print(i+" ");
			System.out.print(Thread.currentThread().getName());
		}
	}

	public static void main(String args[]) {
		Thredemo t1 =new Thredemo();
		Thredemo t2 =new Thredemo();
		
		t1.start();
		t1.setName("t1-");
		t1.setDaemon(true);
		
		//	t1.join(2000);
		//t1.setPriority(Thread.MIN_PRIORITY);
		
		t2.start();		
		t2.setName("t2-");
		t2.setPriority(Thread.MAX_PRIORITY);
	}
	}
