package javabook.c8;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex4 extends JFrame{
	JButton bt1 = new JButton("버튼1");
	JButton bt2 = new JButton("버튼2");
	JButton bt3 = new JButton("버튼3");
	JButton bt4 = new JButton("버튼4");
	JButton bt5 = new JButton("버튼5");
	JButton bt6 = new JButton("버튼6");
	
	Panel p1 = new Panel();
	Panel p2 = new Panel();
	
	public void flowLayout() {
		p1.setLayout(new FlowLayout());
		p1.add(bt1);
		p1.add(bt2);
		p1.add(bt3);
		p1.add(bt4);	
	}
	
	public void gridLayout() {
		p1.setLayout(new GridLayout());
		p1.add(bt1);
		p1.add(bt2);
		p1.add(bt3);
		p1.add(bt4);
	}

	public void borderLayout() {
		p1.setLayout(new BorderLayout());
		p1.add(bt1, BorderLayout.NORTH);
		p1.add(bt2, BorderLayout.WEST);
		p1.add(bt3, BorderLayout.EAST);
		p1.add(bt4, BorderLayout.SOUTH);
		p1.add(bt4, BorderLayout.CENTER);
	}
	
	public void cardLayout() {
		final CardLayout card = new CardLayout();
		setLayout(card);
		p1.add(bt1);
		p1.add(bt2);
		p1.add(bt3);
		p2.add(bt4);
		p2.add(bt5);
		
		add("p1", p1);
		add("p2", p2);
		
		bt1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				card.show(getContentPane(), "p2");
			}
		});
		
		bt2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				card.show(getContentPane(), "p2");
			}
		});
		
		bt3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				card.show(getContentPane(), "p2");
			}
		});
		
		bt4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				card.show(getContentPane(), "p1");
			}
		});
		
		bt5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				card.show(getContentPane(), "p1");
			}
		});
	}
	
	public void grid() {
		p1.setLayout(new GridLayout(2,0));
		p1.add(bt1);
		p1.add(bt2);
		p1.add(bt3);
		p1.add(bt4);
		p1.add(bt5);
		p1.add(bt6);
	}
	
	public Ex4() {
		super("야 이 바보야");
		getContentPane().add(p1);
		
		cardLayout();
//		grid();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(270, 100);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		Ex4 ap = new Ex4();

	}

}
