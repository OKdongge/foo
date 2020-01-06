package foo.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * 重定向标准输入到文件
 */
public class NewInTest {
	public static void main(String[] args) {
		FileInputStream in;
		try {
			in = new FileInputStream("C:\\Users\\szl\\Desktop\\new_1.txt");
			System.setIn(in);
			Scanner sc = new Scanner(System.in);
			while(sc.hasNext()) {
				String content = sc.nextLine();
				System.out.println(content);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
