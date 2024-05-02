package p30;

import java.util.Set;
import java.util.TreeSet;

public class Sample04 {

	public static void main(String[] args) {
		//ArrayListクラスのインスタンスの作成
		//		ArrayList<integer> canon = new ArrayList<integer>();
		//		ArrayList<integer> canon = new ArrayList<>();
		Set<String> canon = new TreeSet<>();

		canon.add("Java");
		canon.add("c++");
		canon.add("PHP");

		for (String data : canon) {
			System.out.println(data);
		}
	}

}
