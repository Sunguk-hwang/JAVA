package sec03.exam05;

public class OperationPromotionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		byte result1 = (byte) (byteValue1 + byteValue2);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		//System.out.println(charValue2);
		char result2 = (char) (charValue1 + charValue2);
		System.out.println(result2);
		
		int intValue1 = 10;
		int intValue2 = intValue1 / 4;
		System.out.println(intValue2);
		float f1 = (float) (intValue1 / 4);
		System.out.println(f1);
		double f2 = (double)intValue1 / 4;
		System.out.println(f2);
		
		double f3 = 3.4;
		double f4 = 2.2;
		double f5 = f3 + f4;
		System.out.println(f5);
		int intValue3 = (int)f5;
		System.out.println(intValue3);
		

	}

}
