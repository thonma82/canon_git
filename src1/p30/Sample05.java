package p30;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Sample05 {

	public static void main(String[] args) {
		//ArrayListクラスのインスタンスの作成
		//		ArrayList<integer> canon = new ArrayList<integer>();
		//		ArrayList<integer> canon = new ArrayList<>();
		Map<String, Integer> canon = new HashMap<>();

		canon.put("oku", 10);
		canon.put("kudo", 20);
		canon.put("endo", 30);

		System.out.println(canon.get("oku"));
		System.out.println(canon.get("kudo"));
		System.out.println(canon.get("endo"));

		Set<String> list = canon.keySet();

		for (String key : list) {
			System.out.println(key + "・・・" + canon.get(key));
		}
	}
}
