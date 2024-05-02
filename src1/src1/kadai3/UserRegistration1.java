package kadai3;

import java.util.Scanner;

public class UserRegistration1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("名前を入力してください：");
        String name = scan.next();
        if (name.length() > 20 || name.equals("admin") || name.contains("㌔")) {
            System.out.print("エラー：");
            scan.close();
            return;
        }

        System.out.print("年齢を入力してください：");
        int age = scan.nextInt();
        if (age < 0 || age > 130) {
            System.out.println("エラー");
            scan.close();
            return;
        }

        System.out.println("名前：" + name + "、年齢：" + age + "で登録しました。");
        scan.close();
    }
}