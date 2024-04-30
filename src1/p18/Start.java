package p18;

public class Start {

	public static void main(String[] args) {
		Human h;
		
		
		h= new oku();
		h.name = "奥";
		h.age = 23;
		h.eat();
//		h.cook();
		
		h= new kudo();
		h.name = "工藤";
		h.age = 22;
		h.eat();
//		h.listenMusic();
	}
}
