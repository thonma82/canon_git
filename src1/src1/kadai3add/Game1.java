package kadai3add;
import java.util.Random;
import java.util.Scanner;

public class Game1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in); // System.inを正しく指定

		Random rand = new Random(); // Randomクラスのインスタンスを生成する
		int pc = rand.nextInt(100);
		// 次のintを返すメソッドの引数を指定する
		int count = 0;
		System.out.println(pc);

		while (true) {
			System.out.println("数字を入力してください");
			count++;
			int hito = scan.nextInt();
			if (hito > pc) {
				System.out.println("大きすぎです");
			} else if (hito < pc) {

				System.out.println("小さすぎです");
			} else {
				System.out.println("正解は"+ pc +"です！"+ count + "回で正解しました");
				break;
			}
		}
	}

}
