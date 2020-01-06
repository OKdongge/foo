package foo.thread;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory;
import java.util.concurrent.RecursiveAction;

// 使用多线程打印0-300，4个cpu工作

public class PrintTask extends RecursiveAction {
	private int start;
	private int end;
	private int limit;
	
	public PrintTask(int start,int end) {
		this.start = start;
		this.end = end;
	}
	public void compute() { 
		if(end - start < limit) {
			for(int i= start;i<start;i++) {
				System.out.println(Thread.currentThread().getName()+"当前变量:"+i);
			}
		}else {
			int middle = (end - start)/2;
			PrintTask left = new PrintTask(start,middle);
			PrintTask right = new PrintTask(middle,end);
			left.fork();
			right.fork();
		}
	}
}

class ForkJoinPoolTest{
	public static void main(String[] args) {
		ForkJoinPool pool = new ForkJoinPool();
		pool.submit(new PrintTask(0,300));
		pool.shutdown();
		
	}
}