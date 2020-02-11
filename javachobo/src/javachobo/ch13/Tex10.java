package javachobo.ch13;


public class Tex10 implements Runnable{
	static boolean autosave = false;

	public static void main(String[] args) {
		Thread t = new Thread(new Tex10());
		t.setDaemon(true);
		t.start();
		
		for (int r = 1; r <= 10; r++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
			System.out.println(r);
			
			if(r==5)
				autosave = true;
		}
		
		System.out.println("시스템 끗");
	}

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(3000);
			}catch (InterruptedException q) {}
			if(autosave)
				autosave();
		}

	}

	public void autosave() {
		System.out.println("자동저장");
		
	}
	
}
