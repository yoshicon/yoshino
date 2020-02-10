package javabook.c6;

public class Ch6Ex2 {

	public static void main(String[] args) {
		String str = "케로로 장재미슴 ㄹㅇ루다가";
		for(int q = 0; q < 5 ; q++)
			str = str + q;
		System.out.println(str);
		StringBuffer sb = new StringBuffer();
		sb.append("케로로 장재미슴 ㄹㅇ루다가");
		for(int q = 0; q < 5 ; q++)
			sb.append(q);
		System.out.println(sb.toString());
	}
}
