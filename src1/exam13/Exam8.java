package exam13;

import java.util.Random;
import java.util.Scanner;

public class Exam8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		// プレイヤーとコンピュータの手を決める
		System.out.println("1:グー、2:チョキ、3:パー から選択してください。");
		System.out.print("じゃん、けん、、、：");
		int you = scan.nextInt();
		// コンピュータは1～3のランダムな数値を取得する
		int com = random.nextInt(3) + 1;
		// プレイヤーの手とコンピュータの手を比較して勝敗を出力する(5点)
	}
}
