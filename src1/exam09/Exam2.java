package exam09;

public class Exam2 {

	public static void main(String[] args) {
		int[] ary;
		ary = new int[5];
		ary[0] = 1;
		ary[1] = 5;
		ary[2] = 4;
		ary[3] = 3;
		ary[4] = 2;

		for(int data : ary) {
			System.out.println(data);
		}
	
		if((data) % 2==1) {
			System.out.println(ary);
			
		}
	}

}
