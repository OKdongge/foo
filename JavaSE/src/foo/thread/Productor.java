package foo.thread;

import java.util.concurrent.BlockingQueue;

public class Productor extends Thread{
	public BlockingQueue<String> bq;
	public Productor(BlockingQueue<String> bq) {
		this.bq = bq;
	}
	public void run() {
		String[] list = new String[] {
				"java","struts","spring"
		};
		for(int i=0;i<9999;i++) {
			try {
				System.out.println(getName()+"生产者正产生元素" );
				bq.put(list[i%3]);
				System.out.println(getName()+"生产完成"+list[i%3]);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
