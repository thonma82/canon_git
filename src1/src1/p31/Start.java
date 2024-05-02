package p31;

import java.util.ArrayList;
import java.util.List;

public class Start {

	public static void main(String[] args) {
		//		canon can = new Canon();
		//		Canon[] list = new Canon[2];
		List<Canon> list = new ArrayList<>();
		//		list[0] = new oku();
		//		list[1] = new kudo();

		list.add(new oku());
		list.add(new kudo());

		for (Canon c : list) {
			c.work();
			c.salary();

		}
	}
}
