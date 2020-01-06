package foo.zuoye;

import foo.Interface.Command;

public class CommandTest {
	public static void main(String[] args) {
		int[] target = {1,4,3,2};	
		ProcessArray pa = new ProcessArray();
		pa.process(target, new Command() {
			public void process(int element) {
				System.out.println(element * element);
			}
		});
	}
}
