package kadai4;

public class Item2 {
	// フィールド（名前と価格を定義する） 
	String name;
	int price;
	String moji;

	void showInfo(){
		
		int tax = (int)(price*0.1);
		
		System.out.println("名前:"+ name);
		System.out.println("価格(税抜き):" + price + "円");
		System.out.println("価格(税込み):" + (price+tax) + "円");
		System.out.println("文字:" + moji);
	}
}
