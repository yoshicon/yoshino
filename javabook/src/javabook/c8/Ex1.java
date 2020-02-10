package javabook.c8;
import java.awt.*;

public class Ex1 {
	public static void main(String[] args) {
		Frame f = new Frame("hi");
		f.setLayout(new FlowLayout());
		Label lb = new Label("어서와 모두 너를 기다려");
		f.add(lb);
		f.setSize(500,500);
		f.setVisible(true);
	}

}
