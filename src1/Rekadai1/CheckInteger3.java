package Rekadai1;

import java.util.Scanner;

public class CheckInteger3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("年齢を入力して下さい：");
        int age = scan.nextInt();

        if (0 <= age && age <= 130) {
            System.out.println("正しい年齢です");
        } else {
            System.out.println("0～130で入力してください");
        }
    }

}