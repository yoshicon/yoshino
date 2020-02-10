package javabook.ch7;
import java.io.*;
public class C7ex2 {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		
		System.out.println("입력 먼가");
		try {
			String ip = in.readLine();
			System.out.println(ip);
			out.write(ip);
			out.close();
		}catch(IOException e) {
			System.out.println("");
			e.printStackTrace();
		}
	}
}
