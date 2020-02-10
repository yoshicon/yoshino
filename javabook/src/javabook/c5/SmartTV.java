package javabook.c5;

public class SmartTV extends Product{
	String res;
	
	public SmartTV(String pname, int price, String res) {
		this.pname = pname;
		this.price = price;
		this.res = res;
	}
	
	public void printExtra() {
		System.out.println("해상도 : "+res);
	}

}
