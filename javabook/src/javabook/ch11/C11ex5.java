package javabook.ch11;

public class C11ex5 implements Runnable {
	@Override
	public void run() {
		System.out.println("스레드 가라사대");
	}

	public static void main(String[] args) {
		C11ex4 ap = new C11ex4();
		ap.start();
		System.out.println("아 끗낫어");
	}
}
