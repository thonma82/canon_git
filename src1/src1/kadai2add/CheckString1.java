package kadai2add;

import java.util.Scanner;

public class CheckString1 {

    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         System.out.print("文字列を入力してください：");

         String moji = scan.next();
         System.out.print(moji.length() + "文字です");
    }

}