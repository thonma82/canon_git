package p01;

import java.util.Scanner;

public class Sample9 {
	public static void main(String[] args) {
		//キーボード入力するためのおまじない
		Scanner scan = new Scanner(System.in);
		
		System.out.println("名前を入力");
		String name = scan.next();//キーボードから名前を入力
		
		System.out.println("年齢を入力");
		int age = scan.nextInt();//キーボードから年齢を入力
		
		System.out.println("名前:" + name);
		System.out.println("名前:" + age);
	}

}
