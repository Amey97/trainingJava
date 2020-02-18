package multiThreading;

class CriticalSection {
	synchronized void printCriticalSrction(int n) {
		for (int i = 0; i < 5; i++) {
			System.out.println(n * 1);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

class MyThread1 extends Thread {
	CriticalSection t;

	MyThread1(CriticalSection t) {
		this.t = t;
	}

	public void run() {
		t.printCriticalSrction(100);
	}
}
class MyThread2 extends Thread {
	CriticalSection t;

	MyThread2(CriticalSection t) {
		this.t = t;
	}

	public void run() {
		t.printCriticalSrction(100);
	}
}

public class MultiThreadingExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CriticalSection obj = new CriticalSection();
		MyThread1 t1 = new MyThread1(obj);
		MyThread2 t2 = new MyThread2(obj);
		t1.start();
		t2.start();

	}

}
