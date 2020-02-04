package javabook.c11;

public class Ex3 {
	public void prt() throws MyExp {
		System.out.println("메세지 출력");
		throw new MyExp();
	}

	public static void main(String[] args) {
		Ex3 ap = new Ex3();
		try {
			ap.prt();
		} catch (MyExp e) {
			e.printStackTrace();
		}
	}
}