package Rekadai1;

import java.util.Scanner;

public class CheckInteger1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("数字を入力してください");
        int suuji = scan.nextInt();

        if (suuji == 7) {
            System.out.println("あたり！！");
        }

        else {
            System.out.println("はずれ");
        }
    }
}