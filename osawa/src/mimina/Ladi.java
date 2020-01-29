package mimina;

import java.util.*;

public class Ladi {

	public static void main(String[] args) {
		char a;
		String s;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문장 입력시 영어 대/소문자 변경 프로그램");
		System.out.println("// 입력시 프로그램 종료");

		while (true) {
			System.out.printf("문장 입력 : ");
			s = sc.nextLine();
			if(s == "//")
				break;
			System.out.printf("영문 변경 : ");
			
			for (int i = 0; i < s.length(); i++) { // 문자인식 - 대/소문자 변경 나머지는 그냥 출력
				a = s.charAt(i);
				if ('a' <= s.charAt(i) && s.charAt(i) <= 'z') {
/**/					System.out.printf("%c", a-32);
//					tas.up(a);
				} else if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z') {
/**/					System.out.printf("%c", a+32);
//					tas.dn(a);
				} else
					System.out.printf("%c", a);
			}
			System.out.printf("\n\n");

		}
		System.out.println("ㅅㄱ링");
		sc.close();
	}

}