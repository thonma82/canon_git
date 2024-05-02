package p23;

public class Start {

	public static void main(String[] args) {
		Canon[] list = new Canon[2];
		list[0] = new oku();
		list[1] = new kudo();

		for (Canon c : list) {
			c.work();
			c.salary();

		}
	}
}
