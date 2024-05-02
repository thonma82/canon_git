package kadai5;
public class ItemAction1 { 
public static void main(String[] args) { 
    // 商品オブジェクトを生成 
    Item i = new Item();
    i.setName("絵本");
    i.setPrice(1000);

    System.out.println("名前:" + i.getName());
    System.out.println("価格:" + i.getPrice());

    System.out.println("---");
    
    Item i2 = new Item();
    i2.setName("シャンプー");
    i2.setPrice(222);
    
    System.out.println("商品名:" + i2.getName());
    System.out.println("価格:" + i2.getPrice() + "円");
    }

    // セッターを利用して情報（絵本/1000円）をセットする 
    // ゲッターを利用して商品の情報を出力する 
}