package javabook.c6;
import java.util.*;
import java.text.*;

public class Ch6Ex11 {

	public static void main(String[] args) {
		String m = "{0,date}일 {0,time}에 {1}에서 {2}랑 만나자";
		Object []obj = {new Date(), "집", "바보"};
		MessageFormat mf = new MessageFormat(m);
		System.out.println(mf.format(obj));
		
		String from = "야랙넛";
		String to ="코랙넛";
		final int CHSD = 1;
		String loc = "ZIP";
		
		String ctm = "{0} | {1} | {2} - {3}  | {4}";
		System.out.println(MessageFormat.format(ctm, CHSD, new Date(), from, to, loc));
	}

}
