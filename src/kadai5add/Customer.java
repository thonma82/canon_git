package kadai5add;

public class Customer {
    // フィールド
    int id;
    String name;

    // コンストラクタ
    Customer() {

    }

    Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    Customer(String name) {
        this.name = name;
    }

    //メソッドの定義
    void showData() {
        System.out.println(id + ":" + name);
    }
}