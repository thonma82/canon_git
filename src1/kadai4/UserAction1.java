package kadai4;

public class UserAction1 {
	public static void main(String[] args) {
		// 田中太郎（20）の情報を登録して出力 
		User user1 = new User();

		user1.name = "田中太郎";
		user1.age = 20;

		user1.showInfo();

		System.out.println("---");

		// 鈴木一郎（25）の情報を登録して出力 

		User user2 = new User();

		user2.name = "鈴木一郎";
		user2.age = 25;

		user2.showInfo();

	}
}