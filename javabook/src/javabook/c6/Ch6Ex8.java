package javabook.c6;

import java.util.StringTokenizer;

public class Ch6Ex8 {
	public static void main(String[] args) {
		String m = "바보,0314,집,무직,백수";
		StringTokenizer st = new StringTokenizer(m, ",");

		System.out.println("믜 : " + st.nextToken());
	}

}
