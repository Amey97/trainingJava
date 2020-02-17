package inputOutput;

import java.io.PipedReader;
import java.io.PipedWriter;

public class PipeReaderWriter {

	private static PipedWriter write;

	public static void main(String[] args) {
		try {
			final PipedReader read = new PipedReader();
			write = new PipedWriter(read);
			
			Thread readerThread = new Thread(new Runnable() {
				public void run() {
					try {
						int data = read.read();
						while (data != -1) {
							System.out.print((char)data);
							data = read.read();
						}
					} catch(Exception ex) {
					}
				}
			});
			Thread writerThread = new Thread(new Runnable() {
				public void run() {
					try {
						write.write(" Hello world" .toCharArray());
					} catch(Exception ex) {
					}
				}
			});
			readerThread.start();
			writerThread.start();
			
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		}
}
