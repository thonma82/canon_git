package p29;

public class Sample11 {

	public static void main(String[] args) {

		try {
			System.out.println(waru(10, 0));
		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			System.out.println();
			e.printStackTrace();
		}
	}

	public static int waru(int x, int y) throws Exception {
		if (y == 0) {
			throw new Exception("0で割れないよ");
		}
		return x / y;
	}

}
