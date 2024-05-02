package exam13;

public class Exam2 {

    public static void main(String[] args) {
        int[] ary = {1, 5, 4, 3, 2};
        for (int x : ary) {
            if (x > 0 && (x % 2 == 1)) {
                System.out.println(x);
            }
        }
    }
}