package mimina;
import java.util.*;

public class Ladi {

	public static void main(String[] args) {

		System.out.println("!! % !!");
		Scanner s = new Scanner(System.in);
		int qwe = s.nextInt(), hap =0, t=0;

		System.out.println("");
		
		while(qwe!=0){
			t++;
			System.out.println(t);
			System.out.println("qwe : " + qwe);
			System.out.println("hap : " + hap);
			
			hap = hap+qwe%10;
			qwe /= 10;

			System.out.println("");

		}
		System.out.println("hap : " + hap);
		System.out.println("owari");

		s.close();
	}

}