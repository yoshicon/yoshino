package javabook.c11;

public class MyExp extends Exception{
	private String msg = null;
	
	public MyExp() {
		super();
		msg = "오류! 오류! 오류!";
	}
	
	public String toString() {
		return msg;
	}

}
