package CheckString3;

import java.util.Scanner;

public class CheckString3 {

	public CheckString3() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("名前:");
		String name = scan.next();
		
		if (name.length() >= 20) {
			System.out.println("エラー：20文字以内で入力してください");
		}else {
			System.out.println("ようこそ" + name + "さん");
		}
		
		

	}

}
