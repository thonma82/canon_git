package Rekadai1;

import java.util.Scanner;

public class CheckString2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("色を入力して下さい：");
		String iro = scan.next();
		
		switch(iro) {
		case "red" :
			System.out.println("赤です");
			break;
	     
		case "green" :
			System.out.println("緑です");
			break;
			
		case "blue" :
			System.out.println("青です");
			break;
			
		default:
			System.out.println("他の色を入力させてください");
			break;
		}
	}
}
