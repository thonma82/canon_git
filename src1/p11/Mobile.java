package p11;

public class Mobile extends Camera{
    //フィールド
	private String telNo;
	
	//メソッド
	void talk() {
		System.out.println("電話番号:" + telNo);
		System.out.println("話し中です！");
	}
}
