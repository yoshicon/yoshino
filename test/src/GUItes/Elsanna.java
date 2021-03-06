package GUItes;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;

import javax.swing.*;

import javax.imageio.ImageIO;

// 엘산나 225 * 225
public class Elsanna extends JFrame implements ActionListener{

	String elsa = "D:\\dev\\test\\src\\GUItes\\elsa.png";
	String anna = "D:\\dev\\test\\src\\GUItes\\anna.png";
	BufferedImage img = null;
	int ind =0;
	
	JButton bt1 = new JButton("<=");
	JButton bt2 = new JButton("=>");
	JLayeredPane lap = new JLayeredPane();
	

	public Elsanna() {
		setTitle("엘산나");
		
		BorderLayout lay = new BorderLayout();
		setLayout(lay);
		
		bt1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ind--;
				cng();

			}
		});
		bt2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ind++;
				cng();

			}

		});
		
		lap.setSize(255, 255);
		add(bt1, BorderLayout.WEST);
		add(bt2, BorderLayout.EAST);
		add(lap, BorderLayout.CENTER);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	}
	
	public void cng() {
		if((ind % 2) ==0){
			try {
				img = ImageIO.read(new File(elsa));
			} catch (IOException e) {
				JOptionPane.showMessageDialog(null, "커여운 바넬쟝을 못본다는...");
				System.exit(0);
			}
		}
		else{
			try {
				img = ImageIO.read(new File(anna));
			} catch (IOException e) {
				JOptionPane.showMessageDialog(null, "커여운 바넬쟝을 못본다는...");
				System.exit(0);
			}
		}
		
		mypan pan = new mypan();
		pan.setSize(300, 255);
		lap.add(pan);
		add(lap);
		setBounds(0,0,300, 300);
		setVisible(true);
		
	}
	
	class mypan extends JPanel{
		public void paint(Graphics g) {
			g.drawImage(img, 0, 0, null);			
		}	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		Elsanna ap = new Elsanna();
		
	}
}
