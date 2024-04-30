package p07;

public class Start {

	public static void main(String[] args) {

		Human h = new Human();

		h.setName("本間たおり");
		h.setAge(-22);

		System.out.println("名前:" + h.getName());
		System.out.println("名前:" + h.getAge());

		//h.name = "本間たおり";
		//h.age = 23;

	}
}