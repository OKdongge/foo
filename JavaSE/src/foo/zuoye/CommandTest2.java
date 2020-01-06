package foo.zuoye;

public class CommandTest2 {
	public static void main(String[] args) {
		ProcessArray pa = new ProcessArray();
		int[] target = {1,3,5,2};
		pa.process(target, element->System.out.println("数组元素的平方是：" + element * element));
		
	}
}
	