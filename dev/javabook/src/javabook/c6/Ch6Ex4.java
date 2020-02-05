package javabook.c6;
import java.util.*;

public class Ch6Ex4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("path : "+System.getenv("PATH"));
		System.setProperty("user", "김근학");
		System.out.println("속성 : "+System.getProperty("user"));
		
		System.out.println("x to joy");
		while(true) {
			if (s.next().equals("x")) {
				System.out.println("끗");
				System.exit(0);
			} else
				System.out.println("리겜해 리겜");
		}
	}
}
