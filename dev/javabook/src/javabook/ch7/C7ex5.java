package javabook.ch7;
import java.io.*;
import java.util.*;

public class C7ex5 {

	public static void main(String[] args) {
		System.out.println("gui없이 메모장");
		System.out.print("저장할 파일 이름 : ");
		Scanner sc = new Scanner(System.in);
		String fn = sc.next();
		System.out.println("마지막줄에 !q 입력시 저장 - 종료");
		
		try{
			BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter wt = new BufferedWriter(new FileWriter("D:/dev/"+fn+".txt"));
			String s;
			while(!(s = rd.readLine()).equals("!q"))
				wt.write(s+"\r\n");
			rd.close();
			wt.close();
			sc.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("끗");
	}

}
