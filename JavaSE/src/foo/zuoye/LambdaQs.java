package foo.zuoye;

interface Eatable{
	void taste();
}
interface Flyable{
	void fly(String weather);
}

interface Addable{
	int add(int a, int b);
}

public class LambdaQs {
	public void eat(Eatable e) {
		System.out.println(e);
		e.taste();
	}
	
	public void drive(Flyable f) {
		System.out.println("我正在驾驶：" + f);
		f.fly("晴天");
	}
	
	public void test(Addable add) {
		System.out.println("5和3的和为：" + add.add(5, 3));
	}
	
	public static void main(String[] args) {
		LambdaQs lq = new LambdaQs();
		lq.eat(()->System.out.println("苹果的味道不错"));
		
		lq.drive((weather)->{
			System.out.println("今天天气是：" + weather);
			System.out.println("直升机飞的很稳");
		});
		lq.test((a,b) -> a + b);
	}
}
