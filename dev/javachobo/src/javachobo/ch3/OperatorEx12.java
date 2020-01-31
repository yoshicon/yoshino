package javachobo.ch3;

public class OperatorEx12 {

	public static void main(String[] args) {
		char a1 = 'a', a2 = a1, a3;

		int q = a1 + 1;

		a3 = (char) (a1 + 1);
		
		System.out.println("1 = " + a1);
		System.out.println("2 = " + a2);
		System.out.println("3 = " + a3);
		System.out.println("q = " + q);
		
		System.out.println("===========================");
		
		a2++;
		a2++;
		
		System.out.println("q = " + q);
		System.out.println("a2 = " + a2);
		System.out.println("a3 = " + a3);

	}

}
