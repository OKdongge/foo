package foo.zuoye;

public class GenderTest {
	public static void main(String[] args) {
		// 获得枚举值
		Gender f = Enum.valueOf(Gender.class, "FEMALE");
		// 访问成员变量
//		f.name = "女";
		System.out.println(f + " 的名字是 " + f.getName());
	}
}
