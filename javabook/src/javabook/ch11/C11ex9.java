package javabook.ch11;
import java.util.ArrayList;

public class C11ex9 {
	private void printAr() {
		ArrayList<Integer> lt = new ArrayList<>();
		for(int q=1;q<4;q++)
			lt.add(q);
		
		/*
		for(Integer n : lt)
			System.out.println(n);
		 /*/
		
		lt.forEach(babo -> {System.out.println(babo);});
		//*/
	}

	public static void main(String[] args) {
		C11ex9 ap = new C11ex9();
		ap.printAr();
	}
	
}
