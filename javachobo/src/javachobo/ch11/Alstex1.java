package javachobo.ch11;

import java.util.*;

public class Alstex1 {
	public static void main(String[] args) {
		
		ArrayList<Integer> al1 = new ArrayList<>();
		al1.add(new Integer(72));
		al1.add(new Integer(64));
		al1.add(new Integer(127));
		al1.add(new Integer(172));
		al1.add(new Integer(69));
		al1.add(new Integer(58));
		
		ArrayList<Integer> al2 = new ArrayList<>(al1.subList(1, 4));
		
		pt(al1, al2);		
	}

	private static void pt(ArrayList<Integer> al1, ArrayList<Integer> al2) {
		System.out.println("l1 : "+al1);
		System.out.println("l2 : "+al2);
		System.out.println();
	}
}
