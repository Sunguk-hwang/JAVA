package practice.August08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2869 {
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String input = br.readLine();
			String[] arr = input.split(" ");
			int u = Integer.parseInt(arr[0]);
			int d = Integer.parseInt(arr[1]);
			int h = Integer.parseInt(arr[2]);
			
			int t = ((h-u)/(double)(u-d) + 1)==((h-u)/(u-d) + 1) ? ((h-u)/(u-d) + 1) : ((h-u)/(u-d) + 1) + 1;
			System.out.println(t);
		} catch(IOException e) {
		}
		
		
		
	}

}
