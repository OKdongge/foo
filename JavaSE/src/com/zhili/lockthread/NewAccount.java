package com.zhili.lockthread;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class NewAccount {
	public String accountNo;
	public int balance;
	
	private boolean flag = false;
	private final ReentrantLock lock = new ReentrantLock();
	Condition newCondition = lock.newCondition();
	
	public NewAccount() {	}
	public NewAccount(String no,int balance) {
		this.accountNo = no;
		this.balance = balance;
	}
	public NewAccount(String name,String no,int balance) {
		this.accountNo = no;
		this.balance = balance;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public int getBalance() {
		return balance;
	}
	
	public void draw(int amount) {
		try {
			lock.lock();
			if(flag == false) {
				newCondition.await();
			}else {
				System.out.println(Thread.currentThread().getName() + "取钱： " + amount);
				balance -= amount;
				System.out.println("余额为："+this.balance);
				flag = false;
				newCondition.signalAll();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
			
		}
	public void deposit(int amount) {
		try {
			lock.lock();
			if(flag == false) {
				System.out.println(Thread.currentThread().getName() + "存钱： " + amount);
				balance += amount;
				System.out.println("余额为："+this.balance);
				flag = true;
				newCondition.signalAll();
			}else {
				newCondition.await();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
	}
}

	
