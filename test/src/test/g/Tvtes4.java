package test.g;

public class Tvtes4 {
	public static void Tv4() {
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
