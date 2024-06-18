package snchronization;

public class Increment {
	int cnt;
	public synchronized void get_increment() {
		cnt++;
	}

}
