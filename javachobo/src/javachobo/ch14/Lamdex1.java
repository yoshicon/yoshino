package javachobo.ch14;


interface Myf{
	void run();
}

public class Lamdex1 {
	static void exec(Myf f) {
		f.run();
	}

	static Myf getMyf() {
		Myf f = () -> System.out.println("f3 시작");
		return f;
	}
	
	public static void main(String[] args) {
		Myf f1 = () -> System.out.println("f1 시작");
		Myf f2 = new Myf() {
			public void run() {
			System.out.println("f2 시작");	
			};
		};
		Myf f3 = getMyf();
		
		f1.run();
		f2.run();
		f3.run();
		
		exec(f1);
		exec(	() -> System.out.println("ㄱㄱ")	);
	}

}
