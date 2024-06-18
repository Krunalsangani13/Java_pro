package snchronization;

public class SynchronizationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Increment ic = new Increment();
		
		counter c1=new counter();
		counter c2=new counter();
	     
//	     Thread t1 = new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//			
//				for(int i=0;i<2000;i++) {
//					ic.get_increment();	 
//				}
//			}
//		});
//
//	     Thread t2 = new Thread(new Runnable() {
//	 		@Override
//	 		public void run() {
//	 		
//	 			for(int i=0;i<2000;i++) {
//	 				ic.get_increment();
//	 			}
//	 		}
//	 	});
	     c1.start();
	     c2.start();
	     try {
			c1.join();
			c2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	          
	     System.out.println(c1.ic.cnt);
	}
}
