package com.zhili.exercise;

class A{
	public synchronized void foo(B b) {
		System.out.println(Thread.currentThread().getName() + " 进入A的foo方法");
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" 试图调用B的last方法");
		b.last();
	}
	public synchronized void last() {
		System.out.println(Thread.currentThread().getName()+" 进入了A类的last方法内部");
	}
}
class B{
	public synchronized void bar(A a) {
		System.out.println(Thread.currentThread().getName() + " 进入B的bar方法");
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" 试图调用A的last方法");
		a.last();
	}
	public synchronized void last() {
		System.out.println(Thread.currentThread().getName()+" 进入了B类的last方法内部");
	}
}

public class DeadLock implements Runnable{
	A a = new A();
	B b = new B();
	
	public void init() {
		Thread.currentThread().setName("主线程");
		a.foo(b);
	}
	public void run() {
		Thread.currentThread().setName("副线程");
		b.bar(a);
	}
	public static void main(String[] args) {
		DeadLock dl = new DeadLock();
		new Thread(dl).start();
		dl.init();
	}
}
