package foo.thread;

import java.util.concurrent.BlockingQueue;

public class Consumer extends Thread{
	public BlockingQueue<String> bq;
	
	public Consumer(BlockingQueue<String> bq) {
		this.bq = bq;
	}
	public void run() {
		while(true) {
			try {
				System.out.println(getName()+"消费者正取出元素");
				bq.take();
				System.out.println(getName()+"消费完成");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
