package p10;

public class Human {
//フィールドの定義
	String name;
	int age;
//コンストラクタの定義
	Human() {
		
		
		
	}
	Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//メソッドの定義
	void introduce() {
		System.out.println("名前:" + name);
		System.out.println("年齢:" + age);

	}

}
