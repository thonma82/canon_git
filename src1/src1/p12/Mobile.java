package p12;

public class Mobile extends Camera{
    //フィールド
	private String telNo;
	
	
	public Mobile() {
		super();
		System.out.println("Mobileコンストラクタ");
	}
	
	public Mobile(String telNo, String maker) {
		
	}
	
	//セッタ、ゲッタ
	
	public String gettelNo() {
		return telNo;
	}
	
	public void setTelNo(String telNo) {
		this.telNo = telNo;
		
	}
	
	public void talk() {
		System.out.println("電話番号:" + telNo);
		System.out.println("話し中です！");
	}
}
