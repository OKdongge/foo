package com.zhili.exercise;

import com.zhili.lockthread.Account;

public class ThreadTest {
	public static void main(String[] args) {
		Account account = new Account("123",100);
		new DrawThread("A",account,80).start();
		new DrawThread("B",account,80).start();
	}
}
