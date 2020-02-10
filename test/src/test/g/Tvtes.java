package test.g;



public class Tvtes {

	public static void Tv1() {
		Tv t;
		t = new Tv();
	
		t.cnt = 127;
		
		System.out.println("지금 "+t.cnt+"채널");
		t.chdn();
		System.out.println("지금 "+t.cnt+"채널");
	}

}
