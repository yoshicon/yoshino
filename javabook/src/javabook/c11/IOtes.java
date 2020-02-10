package javabook.c11;
import java.io.*;

public class IOtes {

	public static void main(String[] args) {
		try {
			File f = new File("D:\\dev\\javabook\\src\\javabook\\c11\\temp\\a.txt");
//			FileReader fr = new FileReader(f);
			
//			BufferedReader fr = new BufferedReader(new InputStreamReader
//					(new FileInputStream("D:\\dev\\javabook\\src\\javabook\\c11\\temp\\a.txt"),"UTF8"));
			
//			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file),"euc-kr"));
			
			BufferedReader fr = new BufferedReader(new InputStreamReader(new FileInputStream(f), "UTF-8"));
			int sig = 0;
			while((sig = fr.read()) != -1) {
				System.out.print((char)sig);
			}
			fr.close();
		} catch (FileNotFoundException e){
			e.printStackTrace();
		} catch(IOException e) {
			System.out.println(e);			
		}

	}

}
