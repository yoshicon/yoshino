package javabook.ch11;

public class C11ex10 {

	public void prim(Myf fnc) {
		fnc.go("바부");
	}
	public static void main(String[] args) {
		C11ex10 ap = new C11ex10();
		ap.prim((n) -> {System.out.println(n);});
		ap.prim((n) -> {
			for(int q=0; q<10; q++)
				System.out.println(q+"-"+n);
		});

	}
}
