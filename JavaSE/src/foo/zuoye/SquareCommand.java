package foo.zuoye;

import foo.Interface.Command;

public class SquareCommand implements Command{

	public void process(int element) {
		// TODO Auto-generated method stub
		System.out.println("处理后的值为：" + element );
	}

}
