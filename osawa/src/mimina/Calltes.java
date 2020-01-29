package mimina;
import java.util.*;

public class Calltes {
	public static void main(String[] args) {
		
		System.out.println("숫자를 입력하세요오");	// 1
		
		Scanner c = new Scanner(System.in);
/* */ 	int a = c.nextInt(), s=0; 
		
		while(a != 0) {	//5
			s += a%10;	//3
			a = a/10;	//4
		}
		System.out.println("합은 " + s +"인 것이야오");	//6
		
		c.close();
	}

}