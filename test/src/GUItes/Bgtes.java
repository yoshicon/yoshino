package GUItes;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;

import javax.swing.*;
import javax.imageio.ImageIO;

public class Bgtes extends JFrame implements ActionListener {
	BufferedImage img = null;
	
	public Bgtes() {
		setTitle("바넬로피쟈");
//		String fl = "D:\\dev\\test\\src\\GUItes\\vanellope.jpg";
		String fl = "D:\\dev\\img\\van.gif";
		
		
		// 728 * 455
		JLayeredPane lap = new JLayeredPane();
		lap.setSize(500, 500);
		lap.setLayout(null);
		
		try {
	//		img = ImageIO.read(new File(fl));
			InputStream is = new BufferedInputStream(
	            new FileInputStream(fl));
	        img = ImageIO.read(is);
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "커여운 바넬쟝을 못본다는...");
			System.exit(0);
		}
		
		mypan pan = new mypan();
		pan.setSize(500, 500);
		lap.add(pan);
		
		setLayout(null);
		add(lap);
		
		setBounds(10,10,500, 500);
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
