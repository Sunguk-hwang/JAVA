package sec03.exam07;

public class PrimitiveAndStringConversionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String var1 = "2";
		int var2 = Integer.parseInt(var1) + 3;
		System.out.println(var2);
		
		String var3 = "3.14";
		double var4 = Double.parseDouble(var3) + 5;
		System.out.println(var4);
		
		int var5 = 7;
		String var6 = String.valueOf(var5) + 3;
		System.out.println(var6);

	}

}
