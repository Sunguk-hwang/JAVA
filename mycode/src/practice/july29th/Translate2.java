// "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="
// 17:46 ~ 17:59

package practice.july29th;

import java.util.Scanner;

public class Translate2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String inputStr = scanner.nextLine();
		char[] inputArr = inputStr.toCharArray();
		int result = inputArr.length;
		
		for(int p=0; p<inputArr.length; p++) {
			try {
				if(inputArr[p] == 'c') {
					if(inputArr[p+1] == '=') {
						result--;
						p++;
					} else if(inputArr[p+1] == '-') {
						result--;
						p++;
					}
				} else if(inputArr[p] == 'd') {
					if(inputArr[p+1] == 'z' && inputArr[p+2] == '=') {
						result -= 2;
						p += 2;
					} else if(inputArr[p+1] == '-') {
						result--;
						p++;
					}
				} else if(inputArr[p] == 'l' && inputArr[p+1] == 'j') {
					result--;
					p++;
				} else if(inputArr[p] == 'n' && inputArr[p+1] == 'j') {
					result--;
					p++;
				} else if(inputArr[p] == 's' && inputArr[p+1] == '=') {
					result--;
					p++;
				} else if(inputArr[p] == 'z' && inputArr[p+1] == '=') {
					result--;
					p++;
				}
			} catch (Exception e) {
			}
			
		}
		
		System.out.println(result);

	}

}
