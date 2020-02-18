package multiThreading;

class MultiThreadingExample1 extends Thread {
	public void run() {
		System.out.println("thread is running...");
	}

	public static void main(String args[]) {
		MultiThreadingExample1 t1 = new MultiThreadingExample1();
		
		t1.start();
	}
}