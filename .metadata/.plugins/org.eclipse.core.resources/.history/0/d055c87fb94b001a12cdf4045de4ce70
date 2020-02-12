package javabook.ch7;
import java.io.*;
import java.net.*;

public class C7ex7Cl {

	public static void main(String[] args) {
		try {
			Socket s = new Socket("127.0.0.1", 5000);
			System.out.println("클라 실행");
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
			pw.print("하이염");
			pw.close();
			s.close();
			System.out.println("클라끗");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
