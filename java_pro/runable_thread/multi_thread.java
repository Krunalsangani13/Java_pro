package runable_thread;

public class multi_thread {
	
	public static class A extends Thread{
		public void run() {
			try {
				for(int i=1;i<50;i++) {
					if(i%2==0) {
						
						System.out.println("odd->"+i);
					}
				}
				
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	public static class B extends Thread{
		public void run() {
			try {
				for(int i=1;i<50;i++) {
					if(i%2!=0) {
						System.out.println("even->"+i);
					}
				}
				
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	public static void main(String[] arg) throws InterruptedException {
		A t1=new A();
		B t2=new B();
		
		t1.start();
		t2.start();
		
		t2.join();
		
	}
	

}
