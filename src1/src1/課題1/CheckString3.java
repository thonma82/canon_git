package 課題1;

import java.util.Random; // Randomクラスをインポートする

public class CheckString3 {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        Random rand = new Random(); // Randomクラスのインスタンスを生成する
        int rsp = rand.nextInt(3); // 次のintを返すメソッドの引数を指定する

        switch (rsp) {
            case 0: // 0から始まるため、0に対応する
                System.out.println("グー");
                break;
            case 1: // 1に対応する
                System.out.println("チョキ");
                break;
            case 2: // 2に対応する
                System.out.println("パー");
                break; // break文が不足していたため追加する
        }
    }
}