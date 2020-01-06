package foo.zuoye;

import java.util.Arrays;

public class FinalTest {
	public static void main(String[] args) {
		final int[] iArr = {1,2,4,0,3};
		System.out.println(iArr);
		System.out.println(Arrays.toString(iArr));
		Arrays.sort(iArr);
		System.out.println(Arrays.toString(iArr));
		System.out.println();
	}
}
