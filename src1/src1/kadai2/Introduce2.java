package kadai2;

import java.util.Scanner;

public class Introduce2 {

    public static void main(String[] args)
    
   
    {
    	 System.out.println("情報を登録します");
    	 
    	 Scanner scan1 = new Scanner(System.in);
         System.out.println("名前:");
         String name = scan1.next();
         
         Scanner scan2 = new Scanner(System.in);
         System.out.println("趣味1");
         String syumi1 = scan2.next();
         
         Scanner scan3 = new Scanner(System.in);
         System.out.println("趣味2");
         String syumi2 = scan3.next();
         
         Scanner scan4 = new Scanner(System.in);
         System.out.println("趣味3");
         String syumi3 = scan4.next();
         
         System.out.println("---");
         
         System.out.println("こんにちは" + name + "です。");
         
         System.out.println("私の趣味は、");
         
        	String[] ary = {syumi1,syumi2,syumi3};
        	for (String data : ary) {
        		 System.out.println("・" + data);
        	} System.out.println("です。");
            
        }
    }
