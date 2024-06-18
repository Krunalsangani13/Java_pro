package snchronization;

public class counter extends Thread{
	Increment ic = new Increment();
	
	public void run() {
		
		for(int i=0;i<1000;i++) {
			ic.get_increment();	 
		}
	}

	
}
