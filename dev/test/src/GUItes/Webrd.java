package GUItes;

import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Webrd{	
    public static void main( String[] args ) {

    	Image image = null;
    	String tx ="https://i.pinimg.com/236x/c7/a6/e8/c7a6e8925048420f25e281729f8fb7e8.jpg"; 
        try {
            URL url = new URL(tx);
            image = ImageIO.read(url);
        } catch (IOException e) {
        	JOptionPane.showMessageDialog(null, "커여운 바넬쟝을 못본다는...");
			System.exit(0);
        }
 
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        JLabel label = new JLabel(new ImageIcon(image));
        frame.add(label);
        frame.setVisible(true);
    }
}