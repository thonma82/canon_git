package p01;

public class Sample12copy {
    public static void main(String[] args) {

        int age = 22;

        if (20 <= age && age <30) {
            System.out.println("20代");
        } else if (30<= age && age <40) {
            System.out.println("30代");
        } else if (40 <= age && age <50) {
            System.out.println("40代");
        } else {
            System.out.println("該当なし");
        }
    }
}