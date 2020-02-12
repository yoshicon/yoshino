package javabook.ch12;

import java.io.*;
import java.net.*;
import java.util.*;
import java.util.logging.*;

import com.google.gson.*;

public class MCserver {
	// 서버, 클라 연결 소켙
	private ServerSocket ss = null;
	private Socket s = null;
	
	ArrayList<CahtThread> chatThreads = new ArrayList<CahtThread>();
	
	Logger logger;
	
	public void start() {
		logger = Logger.getLogger(this.getClass().getName());
		
		try {
			// 서버 소켓 생성
			ss = new ServerSocket(8888);
			logger.info("멀티 채팅 서버 시작 워");
			
			// 클라 연결 머기
			while(true) {
				s = ss.accept();
				CahtThread chat = new CahtThread();
				chatThreads.add(chat);
				chat.start();
			}
			
		}catch(Exception e) {
			logger.info("서버 시작하는데 오류뜸 ㅋ");
			e.printStackTrace();
		}

	}
	
	void msgSendAll(String msg) {
		for(CahtThread ct : chatThreads)
			ct.outMsg.println(msg);		/////////////////////////// 머임?

	}
	
	
	class CahtThread extends Thread {
		String msg;
		Message m = new Message();	///////////////////////// 않이
		Gson gson = new Gson();
		
		private BufferedReader inMsg = null;
		private PrintWriter outMsg = null;
		
		@Override
		public void run() {
			boolean stat = true;
			logger.info("채팅 뜨레드 시작");
			
			try {
				inMsg = new BufferedReader(new InputStreamReader(s.getInputStream()));
				outMsg = new PrintWriter(s.getOutputStream(),true);
				
				while(stat) {		/////////////////// 클라가 보낸 메세지 처리
					msg = inMsg.readLine();
					m = gson.fromJson(msg, Message.class);
					
					if(m.getType().equals("logout")) {
						chatThreads.remove(this);
						msgSendAll(gson.toJson(new Message(m.getId(),"","님이 종료함","server")));
						stat = false;
					} else if(m.getType().equals("login")) {
						msgSendAll(gson.toJson(new Message(m.getId(),"","님이 접속함","server")));
					}else
						msgSendAll(msg);
				}
				
				this.interrupt();
				logger.info(this.getName() + "끝났어여");
				
			}catch(Exception e) {
				chatThreads.remove(this);
				logger.info("그 머시냐 쓰레드실행하다 오류뜸");
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		MCserver server = new MCserver();
		server.start();
	}
}
