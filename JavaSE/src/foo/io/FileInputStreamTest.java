package foo.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class FileInputStreamTest {
	public static void main(String[] args) {
		int hasRead = 0;
		byte[] b = new byte[1024];
		try {
			FileInputStream fs = new FileInputStream("C:\\Users\\szl\\Desktop\\新建文本文档.txt");
			FileOutputStream fos = new FileOutputStream("C:\\Users\\szl\\Desktop\\新建文本文档_1.txt");
//			Reader reader = new FileReader("C:\\Users\\szl\\Desktop\\新建文本文档.txt");
			
			while((hasRead = fs.read(b)) > 0){
				System.out.println(new String(b,0,hasRead));
				fos.write(b,0,hasRead);
			}
			fs.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
