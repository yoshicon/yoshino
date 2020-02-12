package javachobo.ch13;

public class Tex9 {

	public static void main(String[] args) throws Exception{
		ThreadGroup main = Thread.currentThread().getThreadGroup();
		ThreadGroup gp1 = new ThreadGroup("GP1");
		ThreadGroup gp2 = new ThreadGroup("GP3");
		
		ThreadGroup sbgp1 = new ThreadGroup(gp1, "SBG1");
		
		gp1.setMaxPriority(3);
		
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				try {
					Thread.sleep(1000);
				}catch(Exception q) {}
			}
		};
		new Thread(gp1,		r, 		"th1").start();
		new Thread(sbgp1,	r, 		"th2").start();
		new Thread(gp2,		r, 		"th3").start();
		
		System.out.println(">> 그룹 리스트 : " +main.getName()+
							", 스레드 그룹 : " + main.activeGroupCount()+
							", 스레드 : "+ main.activeCount());
		main.list();
	}

}
