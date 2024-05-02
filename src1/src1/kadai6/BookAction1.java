package kadai6;

public class BookAction1 { 
	
    public static void main(String[] args) { 
        // Bookクラスのオブジェクトを生成し変数b1に代入 
        Book b1 = new Book();
        b1.setName("走れメロス");
        b1.setPrice(450);
        b1.setAuthor("太宰治");
        b1.showInfo();
        // 書籍情報を出力 
        System.out.println("---");
        
        Book b2 = new Book();
        b1.setName("シャーロックホームズ");
        b1.setPrice(600);
        b1.setAuthor("コナン・ドイル");
        b1.showInfo();
    } 
}