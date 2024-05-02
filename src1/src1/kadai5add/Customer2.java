package kadai5add;

public class Customer2 {
    // フィールド
    int id;
    String name;

    // コンストラクタ
    Customer2() {

    }

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
    	System.out.println("価格:" + price);
    	
    }
	}
	