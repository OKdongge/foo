package foo.zuoye;

import foo.Interface.Output;

public class OutFactory {
	public Output makeOut() {
		return new Printer();
	}
	public static void main(String[] args) {
		OutFactory outFactory = new OutFactory();
		Computer computer = new Computer(outFactory.makeOut());
		computer.keyIn("面对对象");
		computer.keyIn("内部类");
		computer.keyIn("jar包");
		computer.keyOut();
	}
}
