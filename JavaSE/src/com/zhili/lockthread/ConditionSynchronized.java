package com.zhili.lockthread;

import com.zhili.thread.DepositThread;
import com.zhili.thread.DrawThread;

public class ConditionSynchronized {
	public static void main(String[] args) {
		NewAccount acc = new NewAccount("2345",0);
		
		new DepositThread("存钱甲",acc,25).start();
		new DrawThread("取钱丙", acc, 30).start();
		new DepositThread("存钱乙",acc,20).start();
		new DrawThread("取钱丁",acc,10).start();
	}
}
