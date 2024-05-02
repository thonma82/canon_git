package exam09;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
       Scanner scan = new Scanner (System.in);
       
	    System.out.print("名前:");
	    String name = scan.next();
	    System.out.print("年齢:");
	    int age = scan.nextInt();
	
	   	 System.out.println( "年齢:"+ age + "歳");
	   	 System.out.println(name + "さんの10年後は"+(age+ 10)+"歳です！");
        
      }
	}


