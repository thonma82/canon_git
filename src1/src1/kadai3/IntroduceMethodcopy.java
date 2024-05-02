package kadai3;

public class IntroduceMethodcopy {
    public static void main(String[] args) {
        syoukai("田中太郎", 25); 
        System.out.println("---"); 
        syoukai("鈴木一郎", 30);
    }

    static void syoukai(String x, int y) {
        System.out.println(x + "は" + y + "歳です");
        System.out.println("10年後は" +( y +10) + "歳です");
        
    }
}