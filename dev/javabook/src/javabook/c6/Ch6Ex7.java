package javabook.c6;
import java.util.Random;;

public class Ch6Ex7 {
	public static void main(String[] args) {
		Random r1 = new Random();
		Random r2 = new Random(123);
		Random r3 = new Random(127);
		Random r4 = new Random(System.currentTimeMillis());
		
		System.out.println("난수... 넣을게");
		System.out.println("r1 : " + r1.nextInt(10));
		System.out.println("r2 : " + r2.nextInt(10));
		System.out.println("r3 : " + r3.nextInt(10));
		System.out.println("r4 : " + r4.nextInt(10));
		
		System.out.println("소난다");
		System.out.println("72~127 => " + (r1.nextInt(10)+72));
	}

}
