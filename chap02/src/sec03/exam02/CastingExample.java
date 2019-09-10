package sec03.exam02;

public class CastingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int v1 = 10;
		byte v2 = (byte) v1;
		
		int v3 = 200;
		byte v4 = (byte) v3;
		
		System.out.println(v2);
		System.out.println(v4);
		
		char v5 = '가';
		int v6 = v5;
		
		int v7 = 65;
		char v8 = (char) v7;
		
		System.out.println(v6);
		System.out.println(v8);
		
		for(int i=65; i<=90; i++) {
			System.out.print((char) i);
		}
		
		double v11 = 10.5;
		float v12 = (float) v11;
		

	}

}
