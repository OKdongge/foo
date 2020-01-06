package foo.thread;

class MyThread extends Thread{
	public MyThread(String name) {
		super(name);
	}
	public MyThread(ThreadGroup group,String name) {
		super(group,name);
	}
	public void run() {
		for (int i=0; i < 20; i++) {
			System.out.println(getName()+"线程的i变量"+i);
		}
	}
}

public class ThreadGoupTest {
	public static void main(String[] args) throws InterruptedException {
		// 默认线程组
		ThreadGroup maingroup = new MyThread("主线程").getThreadGroup();
		System.out.println("主线程组的名字是"+maingroup.getName());
		// 是否是后台线程
		System.out.println("是否是后台线程"+maingroup.isDaemon());
		new MyThread("主线程组的线程").start();
		
		ThreadGroup newGroup = new ThreadGroup("新线程组")	;
		System.out.println("是否是后台线程"+newGroup.isDaemon());
		new MyThread(newGroup,"新线程组的线程甲").start();	;
		new MyThread(newGroup,"新线程组的线程乙").start();	;
		// 关闭线程组
		Thread.sleep(500);
		maingroup.interrupt();
	}
}
