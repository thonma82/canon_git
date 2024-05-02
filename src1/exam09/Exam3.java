package exam09;

public class Exam3 {
	public static void main(String[] args) {
        //長方形の面積を計算する
        int a1 = getSquareArea(3, 3);
        System.out.println(a1);

        //三角形の面積を計算する
        double a2 = getTriangleArea(3, 3);
        System.out.println(a2);
    }

    public static int getSquareArea(int bottom, int height) {
        return bottom * height;
    }

    public static double getTriangleArea(double bottom, double height) {
        return bottom * height / 2.0;
    }
}

