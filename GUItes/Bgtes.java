package GUItes;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Bgtes extends JFrame implements ActionListener {
	BufferedImage img = null;
	
	public Bgtes() {
		setTitle("바넬로피쟈");
		String fl = "D:\\dev\\test\\src\\GUItes\\vanellope.jpg";
		
		// 728 * 455
		JLayeredPane lap = new JLayeredPane();
		lap.setSize(728, 455);
		lap.setLayout(null);
		
		try {
			img = ImageIO.read(new File(fl));
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "커여운 바넬쟝을 못본다는...");
			System.exit(0);
		}
		
		mypan pan = new mypan();
		pan.setSize(728, 455);
		lap.add(pan);
		
		setLayout(null);
		add(lap);
		
		setBounds(0,0,728,455);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
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
		new Bgtes();

	}

}
