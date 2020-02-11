package javachobo.ch13;

public class Tex4 {
	public static void main(String[] args) {
		long sttm = System.currentTimeMillis();
		
		for(int q=0; q<300; q++)
			System.out.printf("%s", new String("-"));
		System.out.println();
		System.out.print("소요시간1 : "+(System.currentTimeMillis()-sttm));
		for(int q=0; q<300; q++)
			System.out.printf("%s", new String("|"));
		System.out.println();
		System.out.print("소요시간2 : "+(System.currentTimeMillis()-sttm));
	}
}
