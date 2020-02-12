package javabook.ch12;

import java.awt.event.*;
import java.io.*;
import java.net.*;
import java.util.logging.*;
import com.google.gson.*;
import static java.util.logging.Level.*;

public class MCcont implements Runnable{
	private final MCUI v;			///////////// 퍼블릭인뎅
	private final MCData chatData;	///////////// 머임?
	
	// 소켓 연결용 변수
	private String ip = "127.0.0.1";
	private Socket socket;
	private BufferedReader inmsg = null;
	private PrintWriter outmsg = null;
	
	Gson gson = new Gson();
	Message m;
	boolean stat;
	Logger logger;
	Thread thread;
	
	public MCcont(MCData chatData, MCUI v) {
		logger = Logger.getLogger(this.getClass().getName());
		
		this.chatData = chatData;
		this.v = v;
	}
	
	public void appMain() {
		chatData.addObj(v.msgOut);			////// 앍
		
		v.addButtonActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Object obj = e.getSource();
				
				// 시마이 버튼
				if(obj == v.extBtn)
					System.exit(0);
				else if (obj == v.loginBt) {
					v.id = v.idInp.getText();
					v.outLb.setText("닉 : "+v.id);
					v.cardlay.show(v.tab, "logout");
					connectServer();					////////////////////
				}else if(obj == v.logoutBtn) {
					outmsg.println(gson.toJson(new Message(v.id, "", "", "logout")));
					v.msgOut.setText("");
					v.cardlay.show(v.tab, "login");
					outmsg.close();
					
					try {
						inmsg.close();
						socket.close();
					}catch(IOException ex) {
						ex.printStackTrace();
					}
					stat = false;
				}else if (obj == v.msgInp) {
					outmsg.println(gson.toJson(new Message(v.id, "", v.msgInp.getText(), "msg")));
					v.msgInp.setText("");
				}
			}

		});
	}
	
	public void connectServer() {
		try {
			socket = new Socket(ip, 8888);
			logger.log(INFO, "클라 -> 서버 연결 성공");
			
			inmsg = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			outmsg = new PrintWriter(socket.getOutputStream(), true);
			
			m = new Message(v.id, "", "", "login");
			outmsg.println(gson.toJson(m));
			
			thread = new Thread(this);
			thread.start();
		}catch(Exception e) {
			logger.log(WARNING, "머시냐 그 UI 연결하다 오류떴다");
			e.printStackTrace();
		}
		
	}
	
	
	@Override
	public void run() {
		MCcont ap = new MCcont(new MCData(), new MCUI());
		ap.appMain();		
	}
}
