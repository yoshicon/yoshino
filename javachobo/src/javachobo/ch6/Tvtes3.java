package javachobo.ch6;

public class Tvtes3 {
	public static void main(String[] args) {
		Tv tv1 = new Tv();
		Tv tv2 = tv1; //new Tv();

		System.out.println("tv1 : "+tv1.cnt);
		System.out.println("tv2 : "+tv2.cnt);
	
		//tv2 = tv1;
		System.out.println("tv1 : 127로 변경");
		tv1.cnt =127;
		
		System.out.println("tv1 : "+tv1.cnt);
		System.out.println("tv2 : "+tv2.cnt);
	}

}
