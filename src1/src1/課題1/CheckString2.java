package 課題1;

import java.util.Scanner;

public class CheckString2 {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

        Scanner iroIn = new Scanner(System.in);
        System.out.println("色を入力して下さい:");
        String iro = iroIn.next();

        switch (iro) {
        case "red":
            System.out.println("赤です");
            break;

        case "green":
            System.out.println("緑です");
            break;
            
        case "blue":
        	System.out.println("青です");
        	break;
        default:
        	System.out.println(iro + "以外の正しい色を入力してください");
        }
    }
}