package coding.test03;

import java.util.Scanner;

import java.util.Arrays;

public class AddMaxMin {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("TestCade?");
		String strNum = scanner.nextLine();
		int numTestCade = Integer.parseInt(strNum);
		int[][] array = new int[numTestCade][10];
		int[] total = new int[numTestCade];
		
		for(int i=1; i<=numTestCade; i++) {
			
			int sum = 0;
			System.out.print("How many?");
			String strCount = scanner.nextLine();
			int numCount = Integer.parseInt(strCount);
			//System.out.println(numCount);
			
			for(int j=0; j<numCount; j++) {
				array[i-1][j] = (int)(Math.random()*10);
				//System.out.println(array[i-1][j]);
			}
			
			for(int m=0; m<numCount-1; m++) {
				for(int n=m+1; n<numCount; n++) {
					int temp = array[i-1][m];
					if (array[i-1][n] < array[i-1][m]) {
						array[i-1][m] = array[i-1][n];
						array[i-1][n] = temp;
					}
				}
			}
			System.out.println(Arrays.toString(array[i-1]));
			
			for(int p=0; p<numCount; p++) {
				//System.out.println(array[i-1][p]);
				//System.out.println(array[i-1][numCount-1-p]);
				sum += (int)(Math.pow(10, p))*(array[i-1][p] + array[i-1][numCount-1-p]);
				//System.out.println((int)(Math.pow(10, p)));
				//System.out.println(sum);
				}
			total[i-1] = sum;
			

		}
		
		for(int i=1; i<=numTestCade; i++) {
			System.out.println("TestCade #" + (i-1) + "= " + total[i-1]);
		}
		
		/*int a = (int)(Math.random()*10);
		System.out.println(a);*/
		/*int[][] array = new int[2][100];
		for(int j=0; j<4; j++) {
			array[0][j] = (int)(Math.random()*10);
			System.out.println(array[0][j]);
		}*/
	}

}
