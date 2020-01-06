package foo.zuoye;

public class IntegerTest {
	public static void main(String[] args) {
		Integer i1 = new Integer(1);
		Integer i2 = new Integer(1);
		System.out.println(i1 == i2);
		
		Integer i3 = Integer.valueOf(2);
		Integer i4 = Integer.valueOf(2);
		System.out.println(i3 == i4);
		Integer i5 = Integer.valueOf(128);
		Integer i6 = Integer.valueOf(128);
		System.out.println(i5 == i6);
	}
}
