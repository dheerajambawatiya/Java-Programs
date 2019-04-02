class CurrentThread {
	public static void main(String args[]) {
		Thread t = Thread.currentThread();      //main thread is obtain by calling currentThread()
		System.out.println("Current thread :" +t);
		t.setName("My Thread");
		System.out.println("After name change");
		try {
			for(int n=5; n>0; n--) {
				System.out.println(n);
				Thread.sleep(1000);
			}
		}
		catch (InterruptedException e) {
			System.out.println("Main thread interrupted");
		}
	}
}