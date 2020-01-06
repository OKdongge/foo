package com.zhili.exercise;

public class InvokeRun implements Runnable {
	public static void main(String[] args) {
		int i = 0;
		for(;i < 100 ; i ++) {
			System.out.println(Thread.currentThread().getName()+"   "+i);
			if(i == 20) {
				new InvokeRun().run();
				new InvokeRun().run();
			}
		}
	}

	@Override
	public void run() {
		int i = 0;
		for(;i < 100; i ++) {
			System.out.println(Thread.currentThread().getName() + " " +i);
		}
	}
}
