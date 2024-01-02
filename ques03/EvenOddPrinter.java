package ques03;

public class EvenOddPrinter {
	
	private static final int MAX_NUM = 20;
	private static volatile int nextNum = 1;
	private static final Object lock = new Object();

	public static void main(String[] args) {
		
		Thread evenThread = new Thread(new EvenRunnable() , "EvenT") ;
		Thread oddThread = new Thread(new OddRunnable() , "OddThread") ;
		
		evenThread.start();
		oddThread.start();
		
		try {
			evenThread.join();
			oddThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	static class EvenRunnable implements Runnable{
		public void run() {
			while(nextNum<=MAX_NUM) {
				synchronized (lock) {
					if(nextNum % 2 == 0) {
						System.out.println(Thread.currentThread().getName()+":"+nextNum);
						nextNum++;
						lock.notify();
						
					}
					else {
						try {
							lock.wait();
						} catch (InterruptedException e) {
							
							e.printStackTrace();
						}
					}
				}
			}
		}
	}
	
	static class OddRunnable implements Runnable{
		
		public void run() {
			while(nextNum<=MAX_NUM) {
				synchronized (lock) {
					if(nextNum % 2 == 1) {
						System.out.println(Thread.currentThread().getName()+":"+nextNum);
						nextNum++;
						lock.notify();
						
					}
					else {
						try {
							lock.wait();
						} catch (InterruptedException e) {
							
							e.printStackTrace();
						}
					}
				}
			}
		}
		
	}

}
