package GUItes;

import java.io.*;

public class EvenMoham {

	public static void main(String[] args) throws IOException {
		String babo = "";
		try {
			String filePath = "D:\\dev\\test\\src\\GUItes\\bab.txt";
			FileInputStream fileStream = null;

			fileStream = new FileInputStream(filePath);
			byte[] readBuffer = new byte[fileStream.available()];
			while (fileStream.read(readBuffer) != -1) {}
			babo += new String(readBuffer);

			fileStream.close();
		} catch (Exception e) {
			e.getStackTrace();
		}

		double rd = Math.random();
		String[] spl = babo.split(", ");
		int iv = (int) (rd * spl.length);
		System.out.println(spl[iv]);
	}
}
