package foo.zuoye;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Count {
	private String[] alphas;
	private int i;
	private boolean flag;
	private final ReentrantLock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
	
	public void printNum() {
		try {
			if(!flag) {
				lock.lock();
				// control the counts to print
				System.out.println(Integer.toString(i+1)+Integer.toString(i+2));
				i = i + 2;
				flag = true;
				condition.notifyAll();
			}else {
				condition.await();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
	}
	
	public void printAlpha() {
		try {
			if(flag) {
				lock.lock();
				System.out.println(alphas[i]);
				i++;
				flag = false;
				condition.notifyAll();
			}else {
				condition.await();;
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally {
			lock.unlock();
	}
}
}
