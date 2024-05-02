package kadai4add;

public class Customer {

	int id;
	String name;

	void setData(String n) {
		name = n;

	}

	void setData(int i, String n) {
		id = i;
		name = n;

	}

	void showData() {
        System.out.println(id + ":" + name);

    }
}
