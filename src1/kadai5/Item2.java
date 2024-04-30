package kadai5;

public class Item2 {
	// フィールド 
	private String name;
	private int price;

	// コンストラクタ 
	Item2() {

	}

	Item2(String name, int price) {
			this.name = name;
			this.price = price;
		}

	//メソッドの定義
	void introduce() {
		System.out.println("商品名:" + name );
		System.out.println("価格:" + price + "円");

	}

}