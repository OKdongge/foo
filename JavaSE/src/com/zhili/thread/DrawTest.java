package com.zhili.thread;

public class DrawTest {
	public static void main(String[] args) {
		Account acc = new Account("2345",0);
		new DrawThread("取钱丙", acc, 30).start();
		new DrawThread("取钱丁", acc, 5).start();
		new DepositThread("存钱甲",acc,25).start();
		new DepositThread("存钱乙",acc,10).start();
	}
}
