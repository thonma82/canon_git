package kadai6;

public class Book extends Item {
    // フィールド 
    private String author;

    public Book(){
    }
    
    // コンストラクタ 
    Book(String name, int price, String author) {
        super(name, price);
        this.author = author;
    }

    // ゲッターセッター 
    void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    // 情報出力用showInfoメソッド
    public void showInfo() {
    	super.showInfo();
    	
        System.out.println("著者:" + author);
    }
}