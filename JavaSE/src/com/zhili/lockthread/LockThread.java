package com.zhili.lockthread;

public class LockThread implements Runnable {
	Account acc = new Account("123456",100);
	
	public void run() {
		acc.draw(80);
	}
	public static void main(String[] args) {
		LockThread lt = new LockThread();
		new Thread(lt).start();
		new Thread(lt).start();
	}
	
}
