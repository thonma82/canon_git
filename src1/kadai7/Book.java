package kadai7;

public class Book extends Item {

	private String author;

	public Book() {

	}

	Book(String name, int price ,String author) {
      super(name,price);
      this.author = author;
      
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void showInfo() {
		super.showInfo();
		System.out.println("著者:" + author);
	}
}
