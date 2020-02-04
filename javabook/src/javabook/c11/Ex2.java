package javabook.c11;

import java.io.*;

public class Ex2 {
	FileInputStream f;

	void oF() throws FileNotFoundException {
		f = new FileInputStream("/tmp/a.txt");
	}

	void pF() throws IOException {
		System.out.println(f.read());
	}

	public static void main(String[] args) {
		Ex2 ap = new Ex2();
		try {
			ap.oF();
			ap.pF();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
