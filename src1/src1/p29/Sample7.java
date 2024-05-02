package p29;

public class Sample7 {

    public static void main(String[] args) {

        try {
            System.out.println(10 / 2);
            System.out.println(Integer.parseInt("s100"));
        } catch (ArithmeticException e) {
            System.out.println("0で割れないよ！");
        } catch (Exception e) {
            System.out.println("エラー");
        } finally {
            // finallyブロック 例外が発生してもしなくても最後に実行される領域
            System.out.println("例外処理終了");
        }
        System.out.println("終了");
    }
}