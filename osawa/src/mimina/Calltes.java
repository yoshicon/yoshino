package mimina;
import java.util.*;

public class Calltes {
	public static void main(String[] args) {
		
		System.out.println("���ڸ� �Է��ϼ����");	// 1
		
		Scanner c = new Scanner(System.in);
/* */ 	int a = c.nextInt(), s=0; 
		
		while(a != 0) {	//5
			s += a%10;	//3
			a = a/10;	//4
		}
		System.out.println("���� " + s +"�� ���̾߿�");	//6
		
		c.close();
	}

}