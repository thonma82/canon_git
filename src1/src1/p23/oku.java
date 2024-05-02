package p23;

public class oku implements Canon{


	@Override
	public void work() {
		System.out.println(Canon.COMPANY);
		System.out.println("SEです");
		
	}

	@Override
	public void salary() {
		System.out.println("25万です");
		
	}

}
