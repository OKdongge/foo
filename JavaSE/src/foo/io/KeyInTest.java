package foo.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class KeyInTest {
	public static void main(String[] args) {
		Reader reader = new InputStreamReader(System.in);
		char[] cbuf = new char[3];
		int hasread = 0;
		try {
			while((hasread = reader.read(cbuf)) > 0) {
				System.out.print(new String(cbuf,0,hasread));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
