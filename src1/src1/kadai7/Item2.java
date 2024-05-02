package kadai7;

public class Item2 {

	private String name;
	private int price;

	Item2() {

	}

	Item2(String name, int price) {
		this.name = name;
		this.price = price;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void showInfo() {
		System.out.println("商品名:" + name + "/" + price);
	}
}
