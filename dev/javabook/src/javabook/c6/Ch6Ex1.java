package javabook.c6;

public class Ch6Ex1 {
	public static void main(String[] args) {

		String kg = "나와라 가제트 만능 나무위키";
		String st1 = "하이요";
		String st2 = "하이요";
		String st3 = new String("하이요");
		String n1 = "20";

		if (st1 == st2)
			System.out.println("s1 == s2");
		else
			System.out.println("s1 != s2");
		
		if (st1 == st3)
			System.out.println("s1 == s3");
		else
			System.out.println("s1 != s3");
		
		if (st1.equals(st3))
			System.out.println("s1 == s3");
		else
			System.out.println("s1 != s3");
		
		System.out.println("n1 + 30 = "+n1 + 30);
		System.out.println("s1 길이 : " + st1.length());
		System.out.println("케로로 장재미슴 4 : " + kg.charAt(4));
		System.out.println("케로로 장재미슴 2~4: " + kg.substring(4, 11));
		System.out.println("케로로 장재미슴 은 -> 머 : " + kg.replace("은", "머"));

	}

}
