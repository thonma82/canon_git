package kadai5add;

public class Customer {
	// フィールド
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

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