package javachobo.ch6;

public class Tv {
	String color;
	boolean power;
	protected int cnt;
	
	protected void pow() {power = !power;}
	protected void chup() { ++cnt;}
	protected void chdn() { --cnt;}
}

/*
	public static void main(String[] args) {}
 * */

