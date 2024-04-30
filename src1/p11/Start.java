package p11;

public class Start {

	public static void main(String[] args) {
		//Cameraクラスを継承したMobileクラスのインスタンスを生成
		Mobile m = new Mobile();

		//フィールドとメソッドにアクセス
//		m.setTelNo = "090-5996-6157";
//		m.setMaker = "キヤノン";

		m.talk();
		m.takePicture();
		
	}
}