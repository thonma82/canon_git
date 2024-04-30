package kadai6;

public class ItemAction {
    public static void main(String[] args) {

        // Itemオブジェクト（ロボット掃除機/50000円）を生成 
        Item soujiki = new Item();
        soujiki.setName("ロボット掃除機");
        soujiki.setPrice(50000);

        // 商品情報を出力 
        System.out.println("商品名:" + soujiki.getName() + "円");
        System.out.println("価格:" + soujiki.getPrice() + "円");

        System.out.println("---");

        // Itemオブジェクト（洗濯機/200000円）を生成 
        Item sentakuki = new Item();
        sentakuki.setName("洗濯機");
        sentakuki.setPrice(200000);

        System.out.println("商品名:" + sentakuki.getName() + "円");
        System.out.println("価格:" + sentakuki.getPrice() + "円");

        // 商品情報を出力 
    }
}