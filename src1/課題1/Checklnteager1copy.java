package 課題1;

import java.util.Scanner;

public class Checklnteager1copy {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		 Scanner scan = new Scanner(System.in);
	        System.out.println("年齢を入力してください:");
	        int age = scan.nextInt();
	        

	        if (0 <= age && age <= 130) {
	            System.out.println("正しい年齢です");
	        } else {
	            System.out.println("0～130で入力してください");
	       
	        }
	    }
	}