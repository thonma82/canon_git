package p30;

import java.util.HashSet;
import java.util.Set;

public class Sample2 {

	public static void main(String[] args) {
		//ArrayListクラスのインスタンスの作成
		//		ArrayList<integer> canon = new ArrayList<integer>();
		//		ArrayList<integer> canon = new ArrayList<>();
		Set<Integer> canon = new HashSet<>();

		canon.add(10);
		canon.add(20);
		canon.add(30);

		for (Integer data : canon) {
			System.out.println(data);
		}
	}

}
