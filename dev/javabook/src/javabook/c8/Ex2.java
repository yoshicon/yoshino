package javabook.c8;
import java.awt.*;
import javax.swing.*;

public class Ex2 extends JFrame {
	public Ex2() {
		super("hallo");
		getContentPane().setLayout(new FlowLayout());
		JLabel lb = new JLabel("swingssssssss");
		getContentPane().add(lb);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(127,127);
		setVisible(true);
	}
	public static void main(String[] args) {
		Ex2 ap = new Ex2();		
	}

}
