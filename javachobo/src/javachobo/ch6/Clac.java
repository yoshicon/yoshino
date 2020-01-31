package javachobo.ch6;

public class Clac {
	public static void main(String[] args) {
		Clacfn cf = new Clacfn();
		long q = 5L, w = 3L;
		
		System.out.println("a + b =" + cf.add(q, w));
		System.out.println("a - b =" + cf.min(q, w));
		System.out.println("a * b =" + cf.gop(q, w));
		System.out.println("a / b =" + cf.nut(q, w));
		System.out.println("a % b =" + cf.nmg(q, w));
	}

}
