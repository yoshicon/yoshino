package test.g;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;


public class Ex01 extends JFrame{

	private static final long serialVersionUID = -711163588504124217L;

	public Ex01(){
		super("event");

		setBounds(100, 100, 300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contantPane = this.getContentPane();
		JPanel pan = new JPanel();
		JButton btn = new JButton("gggg");
		final JTextField tf = new JTextField(5);
		JLabel lab = new JLabel("nanto nanto~ : ");
		JCheckBox ckrandBox = new JCheckBox("random~");
		
		ckrandBox.addChangeListener(new ChangeListener(){

			@Override
			public void stateChanged(ChangeEvent e){
				if(((JCheckBox)e.getSource()).isSelected()){
					tf.setText("rannnn");
					tf.setEnabled(false);
				} else{
					tf.setText("");
					tf.setEnabled(true);
				}
			}
		});

		btn.setMnemonic('S'); // 단축키 설정
		
		pan.add(btn);
		pan.add(lab);
		pan.add(tf);
		pan.add(ckrandBox);
		contantPane.add(pan);

		setVisible(true);
	}
	

	public static void main(String[] args) {
		new Ex01();
    }
}
