package test.g;

public class Tvfn {
	
	void Tv1(){
		Tv t;
		t = new Tv();
	
		t.cnt = 127;
		
		System.out.println("지금 "+t.cnt+"채널");
		t.chdn();
		System.out.println("지금 "+t.cnt+"채널");
	}
	
	void Tv2() {
		Tv tv1 = new Tv();
		Tv tv2 = new Tv();

		System.out.println("tv1 : "+tv1.cnt);
		System.out.println("tv2 : "+tv2.cnt);
	
		System.out.println("tv1 : 127로 변경");
		tv1.cnt =127;
		
		System.out.println("tv1 : "+tv1.cnt);
		System.out.println("tv2 : "+tv2.cnt);
	}
	
	void Tv3() {
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
	
	void Tv4() {
		Tv []tvar = new Tv[3];
		
		for(int a=0;a<tvar.length;a++) {
			tvar[a] = new Tv();
			tvar[a].cnt = a;
			
			System.out.printf("tv%d : %d\n", a, tvar[a].cnt);
		}
		
		System.out.println();
		
		for(int a=0;a<tvar.length;a++) {
			tvar[a].chup();
			System.out.printf("tv%d : %d\n", a, tvar[a].cnt);
		}
	}

}
