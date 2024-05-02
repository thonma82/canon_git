package p29;

public class Sample10 {

	public static void main(String[] args) {

		try {
			throw new Exception("エラーエラー");
		} catch (Exception e) {
			System.out.println("エラー");
			System.out.println(e.getMessage());
			e.printStackTrace();//エラー箇所の表示
		} finally {
			// finallyブロック 例外が発生してもしなくても最後に実行される領域
			System.out.println("例外処理終了");
		}
		System.out.println("終了");
	}
}