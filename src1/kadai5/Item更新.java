package kadai5;

public class Item更新 { 
    // フィールド 
    private String name;
    private int price;
    // コンストラクタ 
    Item更新(){

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
        System.out.println("商品名: " + name);
        System.out.println("価格: " + price + "円");
    }
}