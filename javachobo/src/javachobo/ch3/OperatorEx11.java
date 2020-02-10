package javachobo.ch3;

public class OperatorEx11 {

	public static void main(String[] args) {
		char a='a', d='d', zero='0', e='2';
		
		System.out.printf("%c - %c = %d \n", d, a, d-a);
		System.out.printf("%c - %c = %d \n", e, zero, e-zero);
		System.out.printf("%c = %d \n", a, (int)a);
		System.out.printf("%c = %d \n", d, (int)d);
		System.out.printf("%c = %d \n", zero, (int)zero);
		System.out.printf("%c = %d \n", e, (int)e);
	}

}
