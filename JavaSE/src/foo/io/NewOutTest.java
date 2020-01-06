package foo.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/*
 * 重定向标准输出到文件
 */
public class NewOutTest {
	public static void main(String[] args) {
		FileOutputStream fos;
		try {
			fos = new FileOutputStream("C:\\Users\\szl\\Desktop\\new_2.txt");
			PrintStream out = new PrintStream(fos);
			System.setOut(out);
			
			System.out.println("hello world");
			System.out.println("hello world");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
