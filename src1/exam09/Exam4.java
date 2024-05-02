package exam09;

import java.util.Scanner;

public class Exam4 {
	public static void main(String[] args) {
		Scanner scan = new  Scanner (System.in);
		System.out.println("年齢を入力してください");
		int age = scan.nextInt();
		
		if( 0<= age && age <= 130) {
			System.out.println(age + "歳で登録しました");
		} else if (age <= 0 ) {
			System.out.println("整数で入力してください");
		
		} else  {
			System.out.println ("0以上130以下で入力してください");	
		}	
	
	}
}
	
	
	
	
	

	 