package test.g;


public class Tvtes2 {
	public static void Tv2() {
		Tv tv1 = new Tv();
		Tv tv2 = new Tv();

		System.out.println("tv1 : "+tv1.cnt);
		System.out.println("tv2 : "+tv2.cnt);
	
		System.out.println("tv1 : 127로 변경");
		tv1.cnt =127;
		
		System.out.println("tv1 : "+tv1.cnt);
		System.out.println("tv2 : "+tv2.cnt);
	}

}
