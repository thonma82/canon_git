package kadai3;

import java.util.Scanner;

public class IntroduceMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("名前を入力してください:");
        String name = scan.next();

        System.out.println("年齢を入力してください:");
        int age = scan.nextInt();

        nyuuryoku(name, age);
    }

    public static void nyuuryoku(String name, int age) {
        System.out.println("私の名前は" + name + "です");
        System.out.println("年齢は" + age + "です");
        System.out.println("10年後の年齢は" + (age + 10) + "歳です");
    }
}