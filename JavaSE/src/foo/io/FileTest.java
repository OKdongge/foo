package foo.io;

import java.io.File;
import java.io.IOException;

public class FileTest {
	public static void method1() throws IOException {
		File file1 = new File("C:/Users/szl/Desktop/new_1.txt");
		//can read
//		System.out.println(file1.canRead());
//		System.out.println(file1.compareTo(new File("C:/Users/szl/Desktop/KeyInTest.java")));
		// 获取绝对路径
		
//		String path = file.getAbsolutePath();
		// 获取路径名 Desktop
//		System.out.println(file.getName());
		// 获取
		File file2 = new File("C:/Users/szl/Desktop");
////		System.out.println(file2.list());
//		File[] list2 = file1.listFiles();
//		for(File f:list2) {
//			System.out.println(f);
//		}
		// 获取相对路径
		File file3 = new File("C:/Users/szl/Desktop/newtest/dir/");
		file3.mkdirs();
		File file4 = new File("C:/Users/szl/Desktop/newtest/dir/new_4.txt");
		System.out.println(file4.createNewFile());
//		System.out.println(file1.getAbsolutePath());
//		System.out.println(file1.getPath());

	}
	public static void method2() throws IOException{
		File f1 = new File("C:/Users/szl/Desktop");
		// 获取桌面所有文件的文件名
		File[] list = f1.listFiles();
		for(File f:list) {
			if(!f.isDirectory()) {
				System.out.println(f.getName());
			}
		}
		
	}
	public static void method3() {
		// 获取所有word、txt格式的文件名
		File f1 = new File("C:/Users/szl/Desktop");
		// 获取桌面所有文件的文件名
		File[] list = f1.listFiles();
		for(File f:list) {
		// 获取每一个文件名，对比后缀
			String filename = f.getName();
			String suffix = filename.split(".")[1];
			if(suffix !=null && !f.isDirectory() && (suffix.equals("docx")|| suffix.equals("txt"))) {
				System.out.println(f.getName());
			}
		}
	}
	public static void main(String[] args) throws IOException {
		method3();
	}
}
