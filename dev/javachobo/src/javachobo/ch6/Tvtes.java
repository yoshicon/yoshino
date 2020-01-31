package javachobo.ch6;


/*
class Tv{
	String color;
	boolean power;
	int cnt;
	
	void pow() {power = !power;}
	void chup() { ++cnt;}
	void chdn() { --cnt;}
	
}
//*/

public class Tvtes {

	public static void main(String[] args) {
		Tv t;
		t = new Tv();
	
		t.cnt = 127;
		
//*
		System.out.println("지금 "+t.cnt+"채널");
		t.chdn();
		System.out.println("지금 "+t.cnt+"채널");
//*/
	}

}
