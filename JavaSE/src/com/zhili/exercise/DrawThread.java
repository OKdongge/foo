package com.zhili.exercise;

import com.zhili.lockthread.Account;

public class DrawThread extends Thread{
	public int drawValue;
	
	Account account = new Account();
	
	public DrawThread(String name,Account account,int value) {
		super(name);
		this.account = account;
		this.drawValue = value;
	}
	public void run() {
		account.draw(drawValue);
		}
	}

