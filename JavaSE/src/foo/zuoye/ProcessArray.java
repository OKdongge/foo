package foo.zuoye;

import foo.Interface.Command;

public class ProcessArray {
	public void process(int[] target,Command com) {
		for(int ele:target) {
			com.process(ele);
		}
	}
}
