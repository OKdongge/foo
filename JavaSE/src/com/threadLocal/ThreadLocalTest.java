package com.threadLocal;

class Account{
	private ThreadLocal<String> name = new ThreadLocal<String>();
	public Account(String str) {
		this.name.set(str);
	}
	public void setName(String str) {
		this.name.set(str);
	}
	public String getName() {
		return this.name.get();
	}
}
class LocalThread extends Thread{
	private Account account;
	public LocalThread(String name,Account acc) {
		super(name);
		this.account = acc;
	}
	
	public void run() {
		for(int i=0;i<10;i++) {
			if(i ==6) {
				account.setName(getName());
			}
			System.out.println(account.getName()+"的变量值为"+i);
		}
	}
}


public class ThreadLocalTest {
	public static void main(String[] args) {
		Account acc = new Account("初始名");
		new LocalThread("线程1",acc).start();
		new LocalThread("线程2",acc).start();
	}
}
