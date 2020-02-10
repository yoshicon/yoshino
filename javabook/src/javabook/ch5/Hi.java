package javabook.ch5;

public class Hi {
	private String mg;
	static int cnt = 0;
	static String fx = "";

	public Hi(){
		mg = "haiyo";
	}

	public Hi(String mg){
		this.mg = mg;
	}

	public Hi(String mg, int op){
		if (op==1)
			this.mg = mg;
		else
			this.mg = mg + " babo"; 
	}

	public void prt(){
//		System.out.println(mg);
		cnt ++;
		System.out.println("cnt : " + fx + mg);

    }

	public String getMg(){
		return mg;
	}

	public void setMg(String mg){
		this.mg = mg;
	}
/*
	public static void main(String[] args) {

		System.out.println();

		Hi hai1 = new Hi();
		hai1.prt();

		Hi hai2 = new Hi("ani");
		hai2.prt();

		Hi hai3 = new Hi("baboya", 72);
		hai3.prt();

		hai2.setMg("omega");
		System.out.println(hai2.getMg());

		Hi.fx = " = sapien = ";
		hai2.prt();
		hai3.prt();

		Hi.fx = " = barming = ";
		hai2.prt();
		hai3.prt();
	}
//*/

}
