package exam09;

public class Exam5 {

	public static void main(String[] args) {
		//オブジェクトの生成
		Employee e1 = new Employee();   //("田中太郎", 20);
		//e1.introduce();
		e1.setName("田中太郎"); 
		e1.setAge(20);
		
		System.out.println(e1.getName() +"さんは" +e1.getAge() + "歳です");

	}

}
