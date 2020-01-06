package foo.zuoye;

public class Test {
	public int a = 1;
	public int b = 1;
	
	public void test() {
		System.out.println(a == b);
	}
	public static void main(String[] args) {
		new Test().test();
	}
	
}
