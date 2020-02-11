package javabook.ch11;

public class C11ex7 extends Thread{
	public int tot;
	private sellm sm;
	
	@Override
	public void run() {
		String tname = Thread.currentThread().getName();
		for(int q=0 ; q<3; q++)
			System.out.println(tname+"- 팜"+ sm.sell());
		System.out.println("메인끗");
	}
	
	public C11ex7() {
		sm = new sellm();
		tot = 50;
	}

	public static void main(String[] args) {
		System.out.println("앙 티켓팅-+");
		C11ex7 ap = new C11ex7();
		Thread mt = new Thread(ap);
		mt.start();
		//*
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//*/
	}

	class sellm {
		synchronized int sell() {
			tot--;
			try {
				Thread.sleep(5000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			return tot;
		}
	}

}
