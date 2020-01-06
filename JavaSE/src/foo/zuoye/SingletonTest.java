package foo.zuoye;

class Singleton{
	// 单例类，只能创建一次类,构造函数private，通过静态方法创建类的实例。同时要判断该类的实例是否存在
	// 使用静态类变量；
	private static Singleton singleton;
	private Singleton() {
//		Singleton.getSingleton();// 静态方法要通过类访问
	}
	public static Singleton getSingleton() {
		if(singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}
}
public class SingletonTest {
	public static void main(String[] args) {
			Singleton a = Singleton.getSingleton();
			Singleton b = Singleton.getSingleton();
			System.out.println(a == b);
		}
}
