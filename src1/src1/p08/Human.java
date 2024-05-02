package p08;

public class Human {

	String name;
	int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (!(0 <= age && age <= 130)) {
			return;

		}
		this.age = age;
	}

}
