package javabook.ch12;

import javax.swing.*;

public class MCData {
	JTextArea msgOut;
	
	public void addObj(JComponent comp) {
		this.msgOut = (JTextArea)comp;
	}
	
	public void refreshData(String msg) {
		msgOut.append(msg);
	}
}
