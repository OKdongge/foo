package foo.thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueTest {
	public static void main(String[] args) {
		BlockingQueue<String> bq = new ArrayBlockingQueue<>(1);
		new Productor(bq).start();
		new Productor(bq).start();
		new Consumer(bq).start();
		
	}
}
