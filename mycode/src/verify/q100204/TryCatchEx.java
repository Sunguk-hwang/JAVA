package verify.q100204;

public class TryCatchEx {

	public static void main(String[] args) {

		String[] strArr = new String[] { "2a", "100" };

		for (int i = 0; i <= 2; i++) {
			int value = 0;
			try {
				value = Integer.parseInt(strArr[i]);
				System.out.println(value);
			} catch (NumberFormatException e) {
				System.out.println("숫자만 변환됩니다.");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("String배열 인덱스 초과");
			}
		}
	}
}
