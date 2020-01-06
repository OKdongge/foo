package foo.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamTest {
	public void fos() {
		try {
			OutputStream fs = new FileOutputStream("C:\\Users\\szl\\Desktop\\新建文本文档.txt");
//			char[] c = "hello world";
			byte[] c = new byte[] {'H','e','l','l','o',' ','W','o','r','l','d'};
			fs.write(c);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void fw() {
		try {
			FileWriter fw = new FileWriter("C:\\Users\\szl\\Desktop\\新建文本文档.txt");
			fw.write("hello world...asdfa");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new FileOutputStreamTest().fw();
	}
}
