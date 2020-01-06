package com.zhili.exercise;

public class JoinThread extends Thread{
	public String tn;
	public JoinThread(String name) {
//		tn = name;
		super(name);
	}
	public static void main(String[] args) throws InterruptedException {
		new JoinThread("新线程").start();
		for(int i = 0; i < 100 ; i++) {
			if(i == 20) {
				Thread jt = new JoinThread("被join的线程");
				jt.start();
				jt.join();
			}
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
	@Override
	public void run() {
		for(int i = 0; i< 100 ; i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
}
