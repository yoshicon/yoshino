package javabook.c5;

public class ShopLanch {

	public static void main(String[] args) {
		IShop shop = new MyShop();
		shop.setTitle("내꺼");
		shop.genUser();
		shop.genProduct();
		shop.start();

	}

}
