package mimina;

import java.util.*;

// 팩토리얼 어쩌구 - 재귀

class babo {
    public static void main(String[] args) {
        System.out.printf("insert num : ");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        long st = System.currentTimeMillis();

        int rs = fac(a);
        System.out.println(rs);

        long ed = System.currentTimeMillis(); // 프로그램이 끝나는 시점 계산
        float asdf = ed - st;

        System.out.printf("time : %.5f \n", asdf);
        s.close();
    }

    static int fac(int q) {
        int rs = 0;
        if (q != 1)
            rs = q * fac(q - 1);
        else
            rs = 1;

        return rs;
    }
}