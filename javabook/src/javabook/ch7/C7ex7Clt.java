package javabook.ch7;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.*;

public class C7ex7Clt {
	public static void main(String[] args) {
		try {
			Socket s = new Socket("192.168.0.20", 5000);
			System.out.println("클라 실행");
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));

			pw.print("클라임");
			pw.close();
			s.close();
			System.out.println("클라끗");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
