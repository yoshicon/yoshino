package javachobo.ch13;

public class Tex2 {

	public static void main(String[] args) {
		Tex2_1 t1 = new Tex2_1();
		t1.start();

	}

}

class Tex2_1 extends Thread{
	public void run() {
		throwException();
	}

	public void throwException() {
		try {
		throw new Exception();
	}catch(Exception e) {
		e.printStackTrace();
	}
		
	}
	
}
