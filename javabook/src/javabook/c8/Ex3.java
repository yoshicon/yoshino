package javabook.c8;

import java.awt.*;

public class Ex3 extends Frame {
	public Ex3() {
	super("babo");
	setLayout(new BorderLayout());
	Label t1 = new Label("ld");
	Label t2 = new Label("pw");
	TextField id = new TextField(10);
	TextField pw = new TextField(10);
	
	Button btn = new Button("login");
	
	Panel p1 = new Panel();
	p1.add(t1);
	p1.add(id);
	
	Panel p2 = new Panel();
	p1.add(t2);
	p1.add(pw);
	
	add(p1, BorderLayout.NORTH);
	add(p2, BorderLayout.SOUTH);

	setSize(300, 300);
	setVisible(true);
}
	public static void main(String[] args) {
		Ex3 ap = new Ex3();		
	}

}