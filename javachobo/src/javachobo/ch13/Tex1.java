package javachobo.ch13;

public class Tex1 {
	public static void main(String[] args) {
		Tex1_1 t1 = new Tex1_1();
		
		Runnable r = new Tex1_2();
		Thread t2 = new Thread(r);
		
		t1.start();
		t2.start();
	}
}

class Tex1_1 extends Thread{
	public void run() {
		for(int a=0; a<5 ; a++)
			System.out.println(getName());
	}
	
}

class Tex1_2 implements Runnable{
	@Override
	public void run() {
		for(int a=0; a<5 ; a++)
			System.out.println(Thread.currentThread().getName());
	}	
}
