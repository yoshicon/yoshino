package mimina;
import java.util.*;

/*
0~n 합
*/

public class aho {
	public static void main(String[] args) {
        System.out.println("input num");

        Scanner s = new Scanner(System.in);
        int h=0, a = s.nextInt();

        for(int q=0;q<a;q++){
            h += q;
        }
        System.out.println(h);
        s.close();
    }
}