package foo.Interface;

public interface Output {
	int MAX_CACHE = 50;
	
	void out();
	
	void getData(String msg);
	
	default void print(String[] msgs) {
		for(String msg:msgs) {
			System.out.println(msg);
		}
	}
	
	default void test() {
		System.out.print("默认的test方法");
	}
	static String staticTest() {
		return "接口中的类方法";
	}
}
