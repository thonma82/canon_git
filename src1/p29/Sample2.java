package p29;

public class Sample2 {

	public static void main(String[] args) {
		String s = "ABCXYZCBA";

		System.out.println(s);
		System.out.println(s.length());//文字の長さ
        System.out.println(s.charAt(2));//二号室の文字
        System.out.println(s.substring(3));//三号室以降の文字列
        System.out.println(s.substring(2,5));//2~4号室の文字列
        System.out.println(s.indexOf("C"));//部屋番号の確認
        System.out.println(s.lastIndexOf("C"));//後ろの方の部屋番号の確認
        System.out.println(s.startsWith("ABC"));//指定した文字で始まっているか確認
        System.out.println(s.endsWith("CBA"));//指定した文字で終わっているか
        
        System.out.println(s.startsWith("XYZ", 3));
        
        
        
        
	}

}
