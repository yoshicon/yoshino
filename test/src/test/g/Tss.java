package test.g;

import java.util.*;

public class Tss{
    public static void main(String[] args) {
        int a;
        Scanner s = new Scanner(System.in);
        String q="";

        System.out.println("iiiiiiiiiiiiiiiiiiiiiinnnnnng");
        a = s.nextInt();

        System.out.println(a);

        while(a!=0){
//            System.out.print(a%2);
            a %= 2;
            q += a;
            a /= 2;

            System.out.print("a = " + a + " q = " + q + "\n");
        }

        s.close();
    }

}