package p01;

public class Sample28 {

    static int result;

    public static void main(String[] args) {

        int x = 10;
        kudo(x);

        double result = oku();
        System.out.println(result);
    }

    static void kudo(int x) {
        System.out.println(x);
    }


    static double oku() {
        return 10;
    }

}