package javabook.ch7;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.*;

public class C7ex7Clt {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			Socket s = new Socket("127.0.0.1", 5000);
			System.out.println("클라 실행");
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
			while(sc.next()!="!") {
				pw.print(sc.next());
			}
			pw.close();
			s.close();
			sc.close();
			System.out.println("클라끗");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
