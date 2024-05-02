package kadai2;

import java.util.Scanner;

public class CheckPassword3{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String pass;

        System.out.print("パスワードを入力してください：");
        pass = scan.next();

        while(!pass.equals("himitu")) {
            System.out.print("再入力してください：");
            pass = scan.next();
        }
        System.out.println("ログインできました");
    }
}