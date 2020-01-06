package foo.zuoye;

import foo.Interface.Output;

public class Computer {
	private Output out;
	
	public Computer(Output out){
		this.out = out;
	}
	
	public void keyIn(String msg) {
		out.getData(msg);
	}
	
	public void keyOut() {
		out.out();
		}
	}
