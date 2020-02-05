package javabook.c6;
import java.util.*;

public class Ch6Ex5 {
	public static void main(String[] args) {
		Date d1 = new Date();
		Date d2 = new Date(123141245);
		System.out.println("d1 : " + d1);
		System.out.println("d2 : " + d2);
		
		System.out.println("d1, d2 비교" + d1.compareTo(d2));
		
		Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT + 2"));
		
		System.out.println("시간 : "+cal.get(Calendar.HOUR_OF_DAY) + ":" + cal.get(Calendar.MINUTE));
	}
}
