package runable_thread;

public class main {
	public static void main(String[] arg) {
		thread1 th1 = new thread1();
		th1.start();  // thread class
		
		
		thread2 th2 = new thread2();
		Thread th = new Thread(th2);
		th.start();
	}

}
