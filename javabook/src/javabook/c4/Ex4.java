package javabook.c4;

public class Ex4{
    static int num1 = 10;
    int num2 = 10;

    public static void main(String[] args) {
        Ex4 ts1 = new Ex4();
        Ex4 ts2 = new Ex4();
System.out.println("");
        ts1.num1 = 72;
        ts2.num1 = 172;
        System.out.println("ex1.n : " + ts1.num1);
        System.out.println("ex2.n : " + ts2.num1);
System.out.println("");
        ts1.num2 = 68;
        ts2.num2 = 17;
        System.out.println("ex1.n : " + ts1.num2);
        System.out.println("ex2.n : " + ts2.num2);
    }
}