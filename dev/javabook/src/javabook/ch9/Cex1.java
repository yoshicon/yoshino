package javabook.ch9;

import java.util.*;

public class Cex1 {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		
		hm.put("6", "실바나스");
		hm.put("8", "라그나로스");
		hm.put("10", "요그사론");
		
		System.out.println(hm.get("6"));
		System.out.println("----------------");
		
		Collection<String> c = hm.values();
		
		for(String a : c)
			System.out.println(a);
	}

}
