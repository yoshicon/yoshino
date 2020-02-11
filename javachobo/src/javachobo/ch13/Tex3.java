package javachobo.ch13;

public class Tex3 {

	public static void main(String[] args) {
		Tex3_1  t1 = new Tex3_1 ();
		t1.run();
	}

}
class Tex3_1 extends Thread{
	public void run() {
		throwexp();
	}

	public void throwexp() {
		try {
			throw new Exception();
		}catch(Exception q){
			q.printStackTrace();
		}		
	}
	
}