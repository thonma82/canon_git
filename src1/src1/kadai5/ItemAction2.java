package kadai5;
public class ItemAction2 {
    public static void main(String[] args) {

        // 3つの要素をもつ商品クラスの配列を生成 
        Item2[] items = {
                new Item2("ロボット掃除機", 50000),
                new Item2("空気清浄機", 20000),
                new Item2("扇風機", 4000)
        };

        for (Item2 i : items) {
            i.introduce();
        }

        // 拡張for文とshowInfoメソッドを利用して 
        // 1件ずつ商品情報を出力する 

    }
}