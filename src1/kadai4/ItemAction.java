package kadai4;

public class ItemAction {
	// フィールド（名前と価格を定義する） 
	public static void main(String[] args) {
		// Itemクラスのオブジェクトを生成し変数item1に代入する 
     Item item1 = new Item();
     
		// item1のフィールドに商品名「絵本」、価格「1000」を設定する 
     item1.name = "絵本";
     item1.price = 1000;
     
		// item1を利用して商品名と価格の情報を出力する 
     System.out.println("名前:"+ item1.name);
     System.out.println("価格:"+ item1.price);
     
	}
}
