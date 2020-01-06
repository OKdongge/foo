package com.zhili.exercise;

public class JoinTest implements Runnable {
	public void run() {
		Thread.currentThread().setName("副线程");
		for(int i = 0; i < 100; i ++) {
			System.out.println("当前线程名为："+Thread.currentThread().getName()+ i );
			}
		}
	public static void main(String[] args) {
		JoinTest jt = new JoinTest();
		Thread.currentThread().setName("主线程");
		for(int i = 0; i < 100; i ++) {
			System.out.println("当前线程名为："+Thread.currentThread().getName()+ i );
			if(i == 20) {
				Thread thread = new Thread(jt);
				try {
					thread.start();
					Thread.sleep(100);
					thread.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
