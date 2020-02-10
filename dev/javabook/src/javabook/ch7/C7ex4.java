package javabook.ch7;

import java.io.*;

public class C7ex4 {
	public static void main(String[] args) {
		File rf = new File("D:/dev/babo.txt");
		File wf = new File("D:/dev/bavo.txt");
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(rf));
			BufferedWriter writer = new BufferedWriter(new FileWriter(wf));
			String s;
			
			while((s = reader.readLine()) != null)
				writer.write(s+"- 라인 끗");
			reader.close();
			writer.close();
			rf.delete();
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("시마이");
	}
}
