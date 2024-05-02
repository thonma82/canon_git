package exam13;

import java.util.Scanner;

public class Exam1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //キーボードから名前と年齢を取得して10年後の年齢を出力する
        System.out.print("名前：");
        String name = scan.next();

        System.out.print("年齢："); // 改行する前はprintメソッドを使用する
        int age = scan.nextInt();

        nyuuryoku(name, age);
    }

    public static void nyuuryoku(String name, int age) {
        System.out.println("名前:" + name);
        System.out.println("年齢:" + age);
        System.out.println(name + "さんの10年後の年齢は" + (age + 10) + "歳です!");
    }
}