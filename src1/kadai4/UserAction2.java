package kadai4;

import java.util.Scanner;

public class UserAction2 { 
	 public static void main(String[] args) { 
	  Scanner scan = new Scanner(System.in); 
	  // Userオブジェクトを生成し変数userに代入する 
	 User user1 = new User();
	 System.out.println("名前を入力してください:");
     String name = scan.next();
     
     System.out.println("年齢を入力してください:");
     String age = scan.next();
     


	  // キーボードから名前と年齢を取得しuserにセットする 
	 
	  System.out.println("---"); 
	  System.out.println("会員を登録しました"); 
	 
	  // userの情報を出力する 
	  System.out.println("名前:" + name);
	  System.out.println("年齢:" + age); 
	  
	  scan.close(); 
	 } 
	} 
