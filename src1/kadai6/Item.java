package kadai6;

public class Item {
    // フィールド 
    private String name;
    private int price;

    // コンストラクタ 
    Item() {

    }
    
    Item(String name, int price){
    	this.name = name;
    	this.price = price;
    }

    // ゲッターセッター 
    void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;

    }

    public void showInfo() {
        System.out.println("商品名:" + name);
        System.out.println("価格:" + price +"円");
    }
}
// 情報出力用showInfoメソッド