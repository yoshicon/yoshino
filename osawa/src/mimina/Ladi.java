package mimina;

import java.util.*;

public class Ladi {

	public static void main(String[] args) {
		char a;
		String s;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �Է½� ���� ��/�ҹ��� ���� ���α׷�");
		System.out.println("// �Է½� ���α׷� ����");

		while (true) {
			System.out.printf("���� �Է� : ");
			s = sc.nextLine();
			if(s == "//")
				break;
			System.out.printf("���� ���� : ");
			
			for (int i = 0; i < s.length(); i++) { // �����ν� - ��/�ҹ��� ���� �������� �׳� ���
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
		System.out.println("������");
		sc.close();
	}

}