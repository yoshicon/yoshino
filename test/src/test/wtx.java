package test;

import java.io.FileInputStream;

public class wtx {
	static String babo = "";

	public static void main(String[] args) {
		String filePath = "https://elsanna.000webhostapp.com/etc/bab.txt";
		FileInputStream fileStream = null;
		try {

			fileStream = new FileInputStream(filePath);
			byte[] readBuffer = new byte[fileStream.available()];
			while (fileStream.read(readBuffer) != -1) {
			}
			babo += new String(readBuffer);

			fileStream.close();
		} catch (Exception e) {
			e.getStackTrace();
		}

		String[] spl = babo.split(", ");

		for (String a : spl)
			System.out.println(a);

		System.out.println("끗");
		;
	}
}