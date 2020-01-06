package com.zhili.thread;

public class DepositThread extends Thread{
	// 两个Account类不同
	private Account account;
	private int amount;
	
	public DepositThread(String name,Account account,int amount) {
		super(name);
		this.account = account;
		this.amount = amount;
	}
	public void run() {
		for(int i=0;i<100;i++) {
			account.deposit(amount);
		}
	}
}
