package javabook.ch12;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MCUI extends JFrame{
	private JPanel loginPan;
	protected JButton loginBt;
	
	private JLabel inLab;
	protected JLabel outLb;
	protected JTextField idInp;
	
	private JPanel logoutPan;
	protected JButton logoutBtn;
	
	private JPanel msgPn;
	protected JTextField msgInp;
	protected JButton extBtn;
	
	protected JTextArea msgOut;
	
	protected Container tab;
	protected CardLayout cardlay;
	protected  String id;
	
	public MCUI() {
		super("하쿠나 마라탕");
		// 로그인
		loginPan = new JPanel();
		loginPan.setLayout(new BorderLayout());
		
		idInp = new JTextField(15);
		loginBt = new JButton("ㄱ??");
		
		inLab = new JLabel("닉");
		loginPan.add(inLab, BorderLayout.WEST);
		loginPan.add(idInp, BorderLayout.CENTER);
		loginPan.add(loginBt, BorderLayout.EAST);
		
		// 로그아웃
		logoutPan = new JPanel();
		logoutPan.setLayout(new BorderLayout());
		outLb = new JLabel();
		logoutBtn = new JButton("로그아웉");
		
		logoutPan.add(outLb, BorderLayout.CENTER);
		logoutPan.add(logoutBtn, BorderLayout.EAST);
		
		// 메세지
		msgPn = new JPanel();
		msgPn.setLayout(new BorderLayout());
		msgInp = new JTextField(30);
		
		extBtn = new JButton("끝");
		
		msgPn.add(msgInp, BorderLayout.CENTER);
		msgPn.add(extBtn, BorderLayout.EAST);
		
		// 로그인, 로그아웃 패널 선택
		tab = new JPanel();
		cardlay = new CardLayout();
		tab.setLayout(cardlay);
		tab.add(loginPan, "login");
		tab.add(logoutPan, "logout");
		
		msgOut = new JTextArea("", 10, 30);
		msgOut.setEditable(false);
		
		// 스크롤바 수직, 수평 다 만드는데 수평은 필요할떄만 나옴
		JScrollPane jsp = new JScrollPane(msgOut, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		// 메인프레임에 패널 박기
		add(tab, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);
		add(msgPn, BorderLayout.SOUTH);
		
		cardlay.show(tab, "login");
		
		pack();
		
		setResizable(false);
	}
	
	public void addButtonActionListener(ActionListener Actl){
		loginBt.addActionListener(Actl);
		logoutBtn.addActionListener(Actl);
		extBtn.addActionListener(Actl);
		msgInp.addActionListener(Actl);
	}

}
