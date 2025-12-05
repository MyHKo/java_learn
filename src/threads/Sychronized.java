package threads;
import java.util.ArrayList;

public class Sychronized {
	
	static int countervar = 0;
	
	static synchronized void counter() {
		countervar++;
	}
	
	public static void main(String[] args) {
		
		Runnable proccess = new Runnable() {
			@Override
			public void run() {
				counter();
			}
		};
		
		ArrayList<Thread> arr = new ArrayList();
 		
		for(int i = 0; i < 4; i++) {
			Thread t1 = new Thread(proccess);
			arr.add(t1);
			t1.start();
		}
		
		for(Thread t : arr) {
			try {t.join();} catch (InterruptedException e) {}
		}
		
		System.out.println(countervar);
	}
}
