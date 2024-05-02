package 課題1;

import java.util.Scanner;

public class CheckRandom {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

        Scanner mojiIn = new Scanner(System.in);
        System.out.println("名前:");
        String moji = mojiIn.next();

        if (moji.length() < 20) {
            System.out.println("ようこそ" + moji + "さん");
        } else {
            System.out.println("エラー：20文字以内で入力してください");
        }
    }
}