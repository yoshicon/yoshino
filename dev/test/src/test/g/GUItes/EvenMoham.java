package GUItes;

public class EvenMoham {
	public static void main(String[] args) {
		String[] m = {"맘스터치","롯데리아","본죽","돈까스","순대국",
					"홍콩반점", "덮밥", "초밥"};

		double rd = Math.random();
		int iv = (int)(rd * m.length);
		System.out.println(m[iv]);
	}

}