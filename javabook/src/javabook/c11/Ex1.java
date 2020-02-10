package javabook.c11;

import java.io.*;

public class Ex1 {

	public static void main(String[] args) {
		FileInputStream f;
		try {
			f = new FileInputStream("./temp/a.txt");
			System.out.println(f.read());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
