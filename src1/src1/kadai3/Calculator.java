package kadai3;

public class Calculator {

    public static void main(String[] args) {
    	int a = add(3, 7); 
    	  System.out.println(a);

        int b = sub(3, 7);
        System.out.println(b);
    }

    // 足し算メソッドを作りなさい
    static int add(int x, int y) {
        return x + y;
    }

    // 引き算メソッドを作りなさい
    static int sub(int x, int y) {
        return x - y;
    }

}