package 課題1;

import java.util.Scanner;

public class Checklnteager2 {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

        Scanner scan = new Scanner(System.in);

        System.out.println("xの値を入力してください:");
        int x = scan.nextInt();

        System.out.println("yの値を入力してください:");
        int y = scan.nextInt();

        if (x < y) {
            System.out.println("xはyより小さいです");
        } else if (x > y) {
            System.out.println("xはyより大きいです");
        } else {
            System.out.println("xとyは等しいです");
        }
    }

}