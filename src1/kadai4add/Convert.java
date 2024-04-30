package kadai4add;

public class Convert {
    static void reverse(int a) {
        char[] moji = String.valueOf(a).toCharArray();

        for (int i = moji.length - 1; i >= 0; i--) {
            System.out.print(moji[i]);
        }
        System.out.println();
    }
//reverseはstatic
    static void reverse(double b) {
        char[] moji = String.valueOf(b).toCharArray();
        for (int i = moji.length - 1; i >= 0; i--) {
            System.out.print(moji[i]);
        }
        System.out.println();
    }

    static void reverse(String c) {
        char[] moji = c.toCharArray();
        for (int i = moji.length - 1; i >= 0; i--) {
            System.out.print(moji[i]);
        }
        System.out.println();
    }
}
//s.charAt