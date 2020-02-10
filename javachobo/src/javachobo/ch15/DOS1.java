package javachobo.ch15;
import java.io.*;
import java.util.Arrays;

public class DOS1 {

	public static void main(String[] args) {
		ByteArrayOutputStream bos = null;
		DataOutputStream dos = null;
		
		byte[] rs = null;
		
		try {
			bos = new ByteArrayOutputStream();
			dos = new DataOutputStream(bos);
			
			dos.writeInt(10);
			dos.writeFloat(20.0f);
			dos.writeBoolean(true);
			rs = bos.toByteArray();
			String[] hx = new String[rs.length];
			
			for(int q = 0; q < rs.length; q++)
				if(rs[q] <0)
					hx[q] = String.format("%02x", rs[q]+256);
				else
					hx[q] = String.format("%02x", rs[q]);
			System.out.println("10 : "+Arrays.toString(rs));
			System.out.println("16 : "+Arrays.toString(hx));			
			dos.close();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
