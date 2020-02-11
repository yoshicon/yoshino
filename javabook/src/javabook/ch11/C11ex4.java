package javabook.ch11;

public class C11ex4 extends Thread{
	@Override
	public void run() {
		System.out.println("스레드임");
	}
	
	public static void main(String[] args) {
		C11ex4 ap = new C11ex4();
		ap.start();
		System.out.println("끗");
	}
}
