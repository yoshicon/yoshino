package javachobo.ch13;
import javax.swing.*;

public class Tex6 {
	public static void main(String[] args) {
		String ip = JOptionPane.showInputDialog("뭐");
		System.out.println("이거 맛다 : "+ ip);

		for(int q=10; q<0; q--) {
			System.out.println(q);
			try {
				Thread.sleep(1000);
			} catch(Exception w){
				w.printStackTrace();				
			}
		}
	}
}
