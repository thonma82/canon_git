package 課題1;

import java.util.Scanner;

public class Checklnteger4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner numIn = new Scanner(System.in);
		System.out.println("数字を入力してください:");
		int x = numIn.nextInt();

		if (x > 0 && (x % 2 == 0)) {
			System.out.println("x"+ "は正の偶数です");
		} else if (x > 0 && (x % 2 == 1)) {
			System.out.println("x"+ "は正の奇数です");
			
		}
	}
}
