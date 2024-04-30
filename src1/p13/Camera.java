package p13;

public class Camera {
	//フィールド
	protected String maker;
    //フィールド
	   public Camera() {
		   System.out.println("Cameraコンストラクタ");
	   }
	   
	   public Camera(int a) {
		   System.out.println("Cameraコンストラクタ");
		   
	   }
	   
	   //アクセッサメソッド
	//メソッド
	void takePicture() {
		System.out.println("メーカー:" + maker);
		System.out.println("写真撮影中です！");
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}
	
	public void talkPicture() {
		System.out.println("メーカー:" + maker);
		System.out.println("写真撮影中です");
	}
		
}
