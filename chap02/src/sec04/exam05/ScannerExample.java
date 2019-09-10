package sec04.exam05;

import java.util.Scanner;

public class ScannerExample {
	
	public static void main(String[] args) throws Exception {
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
		
			String data = scanner.nextLine();
			
			System.out.println(data);
			
			if(data.equals("ㅂㅂ")) {
				break;
			}
		}
		
	}

}
