
public class Pattern02 extends Thread{
	
	private Object lock;
	
	private String pattern;
	private int count;
	
	public Pattern02(Object lock, String pattern, int count) {
		super();
		this.lock = lock;
		this.pattern = pattern;
		this.count = count;
	}
	
	public void run() {
		synchronized (lock) {
			
			for (int i = 0; i < count; i++) {
				
				System.out.print("Pattern 02 Thread =");
				
				for (int j = 0; j < count - i; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < i+1; j++) {
					
					System.out.print(pattern + " ");
					
				}
				System.out.println();
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				
				lock.notify();
				try {
					lock.wait();
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				
			}
			
		}
	}

}
