package exam13;

import java.util.ArrayList;
import java.util.List;

public class Exam7 {
	public static void main(String[] args) {
		// Employeeクラスのオブジェクトを保存できるListを生成
		List<Employee> list = new ArrayList<>();

		// 「田中太郎、20歳」のEmployeeオブジェクトを生成し、Listに追加する
		list.add(new Employee("田中太郎", 20));

		// 「鈴木一郎、25歳、Java」のEngineerオブジェクトを生成し、Listに追加する
		list.add(new Engineer("鈴木一郎", 30, "Java"));

		// 「佐藤花子、30歳」のEmployeeオブジェクトを生成し、Listに追加する
		list.add(new Employee("佐藤花子", 30));
		// 拡張for文と、introduce()メソッドを利用して各オブジェクトの情報を全て出力

		for (Employee e : list) {
			e.introduce();

		}
	}
}