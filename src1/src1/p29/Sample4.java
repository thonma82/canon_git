package p29;

public class Sample4 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("ABC");
		
//		sb.append("0123456789012222222");
		
		sb.insert(1,"XYZ");
		
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println(sb.replace(1, 3, "DE"));
        
	}

}
