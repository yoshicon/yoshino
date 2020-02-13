package mt;

import java.util.Scanner;

/*
 * 아이디 : hong / 비번 : 1234
 * login 객체 생성
 *
 * */

public class Login {
	public static void main(String[] args) {

		System.out.println("아이디 입력");
		String id = "hong";
		String pw = "1234";
		String ck = "";
		Scanner s = new Scanner(System.in);
		ck=s.next();

		if(ck.equals(id))
		{
			System.out.println("비밀번호도 입력");
			ck = s.next();
			if (ck.equals(pw)) {
				System.out.println("로그인 성공");
			} else
				System.out.println("어 비밀번호 그거 아닌데");

		}else
			System.out.println("어 아이디 그거 아닌데");

		s.close();
	}
}