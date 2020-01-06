package com.zhili.exercise;

public class MySendThread implements Runnable{

	@Override
	public void run() {
		int i = 0;
		for(;i<100;i++) {
			System.out.println(Thread.currentThread().getName()+"--"+i);
		}
	}

	public static void main(String[] args) {
		for(int i = 0;i < 100; i++) {
			System.out.println(Thread.currentThread().getName()+"--"+i);
			if(i == 20) {
				MySendThread mst = new MySendThread();
				new Thread(mst,"线程1").start();
				new Thread(mst,"线程2").start();
			}
			
		}
	}
}
