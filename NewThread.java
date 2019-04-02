class MyThread implements Runnable {
	Thread t;
	MyThread() {		
		t = new Thread(this, "Demo thread");    //a new Thread object is creating by it in MyThread.
		System.out.println("Child thread :" +t);
		t.start();
	}
	public void run() {
		try {
			for(int i=5; i>0; i--) {
				System.out.println("Child Thread :" +i);
				Thread.sleep(500);
			}
		}
		catch (InterruptedException e) {
			System.out.println("Child interrupted");
		}
		System.out.println("Exiting child thread");
	}
}
class NewThread {
	public static void main(String args[]) {
		new MyThread();            //Create a new thread.
		try {
			for(int i=5 ; i>0 ; i--) {
				System.out.println("Main thread : "+i);
				Thread.sleep(1000);
			}
		}
		catch (InterruptedException e) {
			System.out.println("Main thread interrupted");
		}
		System.out.println("Main thread exiting");
	}
}
		
	