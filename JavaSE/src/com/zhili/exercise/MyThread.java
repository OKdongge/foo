package com.zhili.exercise;

public class MyThread extends Thread{
	@Override
	public void run() {
		int i=0;
		for(;i<100;i++) {
			System.out.println(Thread.currentThread().getName()+"--"+i);
		}
	}
	public static void main(String[] args) {
		for(int i=0;i<100;i++) {
			System.out.println(Thread.currentThread().getName()+"--"+i);
			if(i == 20) {
				new MyThread().start();
				new MyThread().start();
			}
		}
	}
}

