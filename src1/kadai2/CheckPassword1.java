package kadai2;

import java.util.Scanner;

public class CheckPassword1 {

	public static void main(String[] args) {
        //キーボードが使用できるようにするおまじない
        Scanner scan = new Scanner(System.in);

        boolean judge = false;
        String pass = "";

        for (int i =1; i <= 3; i++) {
            System.out.print("パスワードを入力してください：");
            pass = scan.next();

            if (pass.equals("himitu")) {
                judge = true;
                break;
            }
                
                System.out.println("不正解です");
        }

        if (judge) {
            System.out.println("ログインできました");
        }   
	}
}