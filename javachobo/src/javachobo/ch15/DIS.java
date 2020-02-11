package javachobo.ch15;
import java.io.*;
public class DIS {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("dam.dat");
			DataInputStream dis = new DataInputStream(fis);
			
			System.out.println(dis.readFloat());
			System.out.println(dis.readBoolean());
			System.out.println(dis.readInt());
			dis.close();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}