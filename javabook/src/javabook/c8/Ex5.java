package javabook.c8;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex5 extends JFrame implements ActionListener{
	int ind = 0;
	String []msg = {"제 1의 아해가 무섭다하오", "제 2의 아해가 무섭다하오", "제 3의 아해가 무섭다하오"};
	JButton bt1 = new JButton("<=");
	JButton bt2 = new JButton("=>");
	JButton bt3 = new JButton("제 1의 아해가 무섭다하오");

	public Ex5() {
		BorderLayout lay = new BorderLayout();
		setLayout(lay);
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		bt3.setEnabled(false);
		
		add(bt1, BorderLayout.WEST);
		add(bt2, BorderLayout.EAST);
		add(bt3, BorderLayout.CENTER);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(350, 350);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		if(ob == bt1)
			ind --;
		else
			ind ++;
		
		if(ind > 2) 
			ind = 0;
		else if (ind <0)
			ind = 2;
		
		bt3.setText(msg[ind]);
		
	}
	
	public static void main(String[] args) {
		Ex5 ap = new Ex5();

	}

}
