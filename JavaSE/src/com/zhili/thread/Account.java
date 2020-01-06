package com.zhili.thread;

public class Account {
	private String accountId;
	private int balance;
	// 默认没有钱
	private boolean flag = false;
	
	public Account() {	}
	
	public Account(String accountId, int balance) {
		super();
		this.accountId = accountId;
		this.balance = balance;
	}
	
	public String getAccountId() {
		return accountId;
	}
	public int getBalance() {
		return balance;
	}
	public synchronized void withdraw(int amount) {
		try {
			if(flag==false) {
				wait();
			}else {
				System.out.println(Thread.currentThread().getName() + "取钱： " + amount);
				this.balance -= amount;
				System.out.println("余额为："+this.balance);
				flag = false;
				notifyAll();
				}
		} catch (InterruptedException e) {
			e.printStackTrace();
			
		}
	}
	public synchronized void deposit(int amount) {
		try {
			if(flag==true) {
				wait();
			}else {
				System.out.println(Thread.currentThread().getName() + "存钱： " + amount);
				this.balance += amount;
				System.out.println("余额为："+this.balance);
				flag = true;
				notifyAll();
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
