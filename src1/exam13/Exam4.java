package exam13;

import java.util.Scanner;

public class Exam4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("年齢を入力してください：");
		int age = 0; // 初期値

		// 文字列が入力された場合は「整数で入力してください」と出力する（5点）
		if (!scan.hasNextInt()) {
			System.out.println("整数で入力してください");
			scan.close();
			return;
		}

		// 0以上130以下の範囲外である場合は「0以上130以下で入力してください」
		// と出力する（5点）
		age = scan.nextInt();
		if (age < 0 || age > 130) {
			System.out.println("0以上130以下で入力してください");
			scan.close();
			return;
		}

		// 0以上130以下の整数だった場合は「○歳で登録しました」と出力する（5点）
		else {
			System.out.println(age + "歳で登録しました！");
			scan.close();
		}
	}
}