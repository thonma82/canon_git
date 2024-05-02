package 課題1;

import java.util.Scanner;

public class Checklnteager2copy {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

        Scanner scan1 = new Scanner(System.in); 
        System.out.println("xの値を入力してください:");
        int x = scan1.nextInt();
        
        Scanner scan2 = new Scanner(System.in); 
        System.out.println("ｙの値を入力してください:");
        int y= scan2.nextInt();
       
        
        if (x < y) {
            System.out.println("xはyより小さいです：");
        } else if (x > y) {
            System.out.println("xはｙより大きいです：");
        }
    }

}