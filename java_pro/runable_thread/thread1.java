package runable_thread;

public class thread1 extends Thread{
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Hi!!");
		}
	}

}
