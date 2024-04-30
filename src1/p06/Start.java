package p06;

public class Start {

	public static void main(String[] args) {

		Human h1 = new Human("本間たおり", 22);
		h1.introduce();
		
		Human h2 = new Human();
		
		h2.name  = "本間たおり";
		h2.age = 23;
		
		
		h2.introduce();

		//h.name = "本間たおり";
		//h.age = 23;

		

	}
}