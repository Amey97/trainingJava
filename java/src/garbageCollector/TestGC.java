package garbageCollector;

public class TestGC {
	@Override
	 protected void finalize()  {
		System.out.println("garbage collection works");
	}

	public static void main(String args[]) {
		TestGC p1 = new TestGC();
		TestGC p2 = new TestGC();
		p1 = null;
		p2 = null;
		System.gc();

	}

}
