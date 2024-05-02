package exam13;

public class Engineer extends Employee {

	private String skill;

	Engineer() {

	}

	Engineer(String name, int age, String skill) {
		super(name, age);
		this.skill = skill;

	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public void introduce() {
		super.introduce();
		System.out.println(skill + "エンジニアです");
	}

}
