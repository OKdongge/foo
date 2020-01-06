package com.zhili.thread;

import com.zhili.lockthread.NewAccount;

public class DrawThread extends Thread{
	private NewAccount account;
	private int amount;
	
	public DrawThread(String name,NewAccount account,int amount) {
		super(name);
		this.account = account;
		this.amount = amount;
	}
	public void run() {
		for(int i=0;i<100;i++) {
			account.draw(amount);
		}
	}
}
