package javabook.ch7;
import java.io.*;
public class C7ex1 {

	public static void main(String[] args) {
		InputStream in = System.in;
		OutputStream out = System.out;
		System.out.println("먼가 입력");
		try {
			int ip = in.read();
			System.out.println(ip);
			out.write(ip);
			out.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
