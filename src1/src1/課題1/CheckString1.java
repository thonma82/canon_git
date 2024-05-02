package 課題1;

import java.util.Scanner;

public class CheckString1 {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

        Scanner passIn = new Scanner(System.in);
        System.out.println("パスワード:");
        String pass = passIn.next();

        if (pass.equals("himitu")){ 
            System.out.println("一致しました");
        } else {
            System.out.println("一致しませんでした");

        }
    }
}