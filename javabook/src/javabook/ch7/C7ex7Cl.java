package javabook.ch7;
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class C7ex7Cl {

	public static void main(String[] args) {
		try {
			Socket s = new Socket("127.0.0.1", 127);
			Scanner sc = new Scanner(System.in);
			System.out.println("클라 실행");
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));

			String st = sc.next();
			pw.print(st);	// 서버에 메세지 입력
			pw.close();
			s.close();
			System.out.println("클라끗");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
