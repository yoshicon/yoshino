package javabook.c6;

public class Ch6Ex3 {
	public static void main(String[] args) {
		Integer n1 = new Integer(72);
		Integer n2 = n1.intValue();
		Integer n3 = 127;
		int n4 = n3;
		String n5 = "74";
		
		System.out.println("n1 : "+ n1);
		System.out.println("n2 : "+ n2);
		System.out.println("n3 : "+ n3);
		System.out.println("n4 : "+ n4);
		
		System.out.println("채대갑 : "+Integer.MAX_VALUE);
		System.out.println("채소갑 : "+Integer.MIN_VALUE);
		System.out.println("크기 : "+Integer.SIZE);
		
		int rs = n1+Integer.parseInt(n5);
		System.out.println("1더하기 5 : "+rs);
	}
}
