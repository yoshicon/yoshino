package javabook.c5;

import java.util.*;

public class MyShop implements IShop{
	
	User[] users = new User[2];
	Product[] products = new Product[4];
	ArrayList<Product> cart = new ArrayList<Product>();
	Scanner s = new Scanner(System.in);
	int selUser;
	String title;

	@Override
	public void setTitle(String title) {
		this.title = title;		
	}
	
	@Override
	public void start() {
		System.out.println(title + " : 메인화면 - 계정선택");
		System.out.println("=========================================");
		
		int i = 0;
		
		for(User u : users) {
			System.out.printf("[%d]%s(%s)\n", i++, u.getName(), u.getPayType());
		}
		
		System.out.println("[x] 오와리다..");
		System.out.print("골라 : ");
		String sel = s.next();
		System.out.println("@@" + sel + "고름 @@");
				
/**
		switch(sel) {
		case "x": System.exit(0);break;
		default:
			selUser = Integer.parseInt(sel);
			productList();
		}
		
*/
		
		switch(sel) {
		case "x": System.out.print("끗!");
				  System.exit(0);break;
		case "0":
		case "1":selUser = Integer.parseInt(sel);
		productList(); break;
		default:
			start();break;
		}
	}
	
	private void productList() {
		System.out.println(title + " : 상품목록 - 상품선택");
		System.out.println("=========================================");
		int i = 0;
		
		for(Product p : products) {
			System.out.println("[" + i +"]");
			p.printDetail();
			i++;
		}
		
		System.out.println("[h] 메인화면");
		System.out.println("[c] 체크아웃");
		System.out.println("선택 : ");
		String sel = s.next();
		System.out.println("@@" + sel + "고름 @@");
		
		switch(sel) {
		case "h": start();break;
		case "c": checkOut();break;
		case "0":
		case "1":
		case "2":
		case "3":
			int psel = Integer.parseInt(sel);
			cart.add(products[psel]);
			productList();break;
		default:
			productList();break;
		}
	}

	private void checkOut() {
		System.out.println(title + " : 체크아웃");
		System.out.println("=========================================");
		int total = 0;
		int i = 0;
		
		for(Product p : cart) {
			System.out.printf("[%d]%s(%s)\n", i++, p.pname, p.price);
			total += p.price;
		}
		
		System.out.println("=========================================");
		System.out.println("결제방법 : "+users[selUser].getPayType());
		
		System.out.println("합계 : "+total+"원임당~");
		System.out.println("[p] - 이전, [q] - 결제완료");
		System.out.println("선택 : ");
		String sel = s.next();
		
		switch(sel) {
		case "q": System.out.println("@@ 결제 끗! 종료! @@");break;
		case "p": productList();break;
		default:
			checkOut();;
		}
	}

	@Override
	public void genUser() {
		User user = new User("바보",PayType.CARD);
		users[0] = user;
		user = new User("힙찔이", PayType.CASH);
		users[1] = user;		
	}

	@Override
	public void genProduct() {
		CellPhone cp = new CellPhone("노5", 120000, "SKT");
		products[0] = cp;
		cp = new CellPhone("ap4", 98000, "KT");
		products[1] = cp;
		
		SmartTV st = new SmartTV("s3D", 127000, "4K");
		products[2] = st;
		st = new SmartTV("LGST", 181818, "FULL HD");
		products[3] = st;
		
	}
	
}
