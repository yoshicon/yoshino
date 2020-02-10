package javabook.ch7;
import java.io.*;
public class C7ex3 {

	public static void main(String[] args) {
		String path = "D:/dev/babo.txt";
		File fl = new File(path);
		System.out.println("넣을게");
		try {
			FileWriter fw = new FileWriter(fl);
			for(int q ='A'; q<='Z'; q++)
				fw.write(q);
			fw.close();
			System.out.println("끗");
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
