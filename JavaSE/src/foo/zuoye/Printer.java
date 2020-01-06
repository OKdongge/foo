package foo.zuoye;

import foo.Interface.Output;

interface product{
	int getProduceTime();
}

public class Printer implements Output,product {
	private String[] ListToPrint = new String[Output.MAX_CACHE];
	private int dataNum = 0;
	public int getProduceTime() {
		return 45;
	}
	public void out() {
		// 打印完将其从列表中删除
//		for(int i = 0; i < dataNum; i++) {
//			System.out.println(ListToPrint[i]);
//		}
		while(dataNum>0) {
			System.out.println(ListToPrint[0]);
			System.arraycopy(ListToPrint, 1, ListToPrint, 0, --dataNum);
			System.out.println(dataNum);
		}
	}
	public void getData(String msg) {
		if(dataNum < MAX_CACHE) {
			ListToPrint[dataNum++] = msg;
		}else {
			System.out.println("列表已满，添加失败");
		}
	}
	public static void main(String[] args) {
		// 模拟队列，打印需要打印的文件
			Output p = new Printer();
			p.getData("java讲义");
			p.getData("java EE ");
			p.getData("html/css/javascript");
			p.out();
		}
}
