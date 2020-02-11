package javachobo.ch14;

import java.util.*;
import java.util.function.*;

public class Lamdex5 {
	public static void main(String[] args) {
		Supplier<Integer> s = () -> (int)(Math.random()*100+1);
		Consumer<Integer> c = i -> System.out.println(i+", ");
		Predicate<Integer> p = i -> 1 %2==0;
		Function<Integer, Integer> f = i -> i/10*10;
		List<Integer> list = new ArrayList<>();
		
		makrd(s, list);
		System.out.println(list);
		printevn(p, c, list);
		List<Integer> newls = dosome(f, list);
		System.out.println(newls);
		
	}
	
	static <T> List<T> dosome(Function<T, T>f, List<T> list){
		List<T> newls = new ArrayList<T>(list.size());
		for(T i : list)
			newls.add(f.apply(i));
		return newls;
	}
	
	static <T> void printevn(Predicate<T> p, Consumer<T> c, List<T> list) {
		System.out.print("[");
		for(T i : list) {
			if(p.test(i))
				c.accept(i);
		}
		System.out.println("]");
	}
	
	static <T> void makrd(Supplier<T> s, List<T> list) {
		for(int q =0; q<10; q++)
			list.add(s.get());
	}

}
