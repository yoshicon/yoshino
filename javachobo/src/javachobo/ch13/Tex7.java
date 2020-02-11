package javachobo.ch13;
import javax.swing.*;

public class Tex7{
	public static void main(String[] args) throws Exception{
		Th7_1 th1 = new Th7_1();
		th1.start();
		
		String ip = JOptionPane.showInputDialog("10초 준다 뭐라도 써바");
		System.out.println("이거 맛냐 : "+ ip);
	}
}

class Th7_1 extends Thread{
	@Override
	public void run() {
		for(int q=10; q>0; q--) {
			System.out.println(q);
			try {
				sleep(1000);
			}catch(Exception w) {
				w.printStackTrace();
			}
		}
	}
}