package javabook.ch7;
import java.io.*;
import java.net.*;

public class C7ex7 {
//192.168.0.11
	public static void main(String[] args) {
		try {
			ServerSocket sc = new ServerSocket(5000);
			System.out.println("서버 실행");
			while(true) {
				Socket s = sc.accept();
				BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
				
				System.out.println("클라 연결");
				System.out.println("클라 왈 : "+br.readLine());
				br.close();
				sc.close();
			}
		}catch(Exception q) {
			q.printStackTrace();
		}
	}
}
