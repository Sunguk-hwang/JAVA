package sec02.exam07;

public class WhileSumFrom1To100Example {

	public static void main(String[] args) {
		
		int sum = 0;
		int i = 1;
		
		while(true) {
			if(i <= 100) {
				sum += i;
			}
			else {
				break;
			}
			i++;
		}
		System.out.println(sum);
		System.out.println(i);

	}

}
