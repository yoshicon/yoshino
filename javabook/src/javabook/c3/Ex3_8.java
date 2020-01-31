package javabook.c3;
import java.util.*;


public class Ex3_8 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.printf("酒捞叼甫 涝仿窍技夸坷 : ");
		
		String d = s.next();
		
		if(d.equals("admin"))
			System.out.println("admin捞 包府磊扼绰扒 绊沥包充捞具");
		else if(d.equals("babo"))
			System.out.println("官焊 せせ风せせ");
		else
			System.out.println(d + "丽捞 肺僔");
		
		s.close();
	}

}
