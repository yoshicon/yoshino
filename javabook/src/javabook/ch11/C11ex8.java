package javabook.ch11;

public class C11ex8 {

	public static void main(String[] args) {
		new Thread(()->{
			System.out.println("하쿠나 마라탕 마라탕탕");
		}).start();
	}
}
