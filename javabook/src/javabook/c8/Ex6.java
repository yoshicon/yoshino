package javabook.c8;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex6 extends JFrame {
	int ind = 0;
	String[] msg = { "제 1의 아해가", "제 2의 아해가", "제 3의 아해가" };
	JButton bt1 = new JButton("<=");
	JButton bt2 = new JButton("=>");
	JButton bt3 = new JButton("제 1의 아해가");

	public Ex6() {
		BorderLayout lay = new BorderLayout();
		setLayout(lay);
		bt1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ind--;
				chtex();

			}
		});

		bt2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ind++;
				chtex();

			}
		});

		bt3.setEnabled(false);
		add(bt1, BorderLayout.WEST);
		add(bt2, BorderLayout.EAST);
		add(bt3, BorderLayout.CENTER);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(350, 350);
		setVisible(true);
	}

	public void chtex() {
		if(ind > 2)
			ind = 0;
		else if (ind < 0)
			ind = 2;
		
		bt3.setText(msg[ind]);
	}

	public static void main(String[] args) {
		Ex6 ap = new Ex6();

	}

}
