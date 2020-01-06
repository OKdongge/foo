package com.zhili.exercise;

public class Withdraw implements Runnable{
	private int balance = 10;
	public void run() {
		withdraw(8);
	}
	public synchronized void withdraw(int value) {
		if(balance >= value) {
			System.out.println(Thread.currentThread().getName() + "取钱成功" +value);
			balance -= value;
			System.out.println("余额为：" + balance);
		}else {
			System.out.println("余额不足，取钱失败");
		}
	}
	public static void main(String[] args) {
		Withdraw st = new Withdraw();
		new Thread(st,"用户A").start();
		new Thread(st,"用户B").start();
	}

}
