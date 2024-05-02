package 課題1;

import java.util.Scanner;

public class Checklnteager3 {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

        Scanner scan = new Scanner(System.in); 
        System.out.println("数字を入力してください:");
        int data = scan.nextInt();

        if (data == 5) {
            System.out.println("ハズレ");
        } else if (data == 7) {
            System.out.println("大当たり！！");
        }
    }

}