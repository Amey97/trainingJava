package multiThreading;

class MultiThreadingExample2 implements Runnable {
	public void run() {
		System.out.println("thread is running...");
	}

	public static void main(String args[]) {
		MultiThreadingExample2 m1 = new MultiThreadingExample2();
		Thread t1 = new Thread(m1);
		t1.start();
	}
}
