package javabook.ch9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Cex3 {
	HashMap<String, ArrayList<String>> prodb;

	public Cex3() {
		prodb = new HashMap<String, ArrayList<String>>();
		ArrayList<String> plst1 = new ArrayList<String>();
		ArrayList<String> plst2 = new ArrayList<String>();
		ArrayList<String> plst3 = new ArrayList<String>();
		
		plst1.addAll(Arrays.asList("히오스", "핫소스통", "고급시계"));
		prodb.put("블", plst1);		
		plst2.addAll(Arrays.asList("-메-", "-던-", "-클-"));
		prodb.put("넥", plst2);		
		plst3.addAll(Arrays.asList("아빠와 나", "전쟁시대", "아이탈출"));
		prodb.put("플", plst3);
	}
	
	void sc() {
		System.out.print("삼중택일 \n목록 :");
		for(String k : prodb.keySet()) {
			System.out.print(" "+k);
		}
		
		Scanner sc = new Scanner(System.in);
		String p = sc.next();
		ArrayList<String> rs = (ArrayList<String>)prodb.get(p);
		
		if(rs != null)
			for(String s : rs)
				System.out.println(s);
		else
			System.out.println("응그없");
		sc.close();
	}

	public static void main(String[] args) {
		Cex3 ap = new Cex3();
		ap.sc();
	}
}
