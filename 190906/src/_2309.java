import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _2309 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int[] arr = new int[7];
		int total=0;
		for(int p=0; p<9; p++) {
			list.add(sc.nextInt());
			total += list.get(p);
		}
		sc.close();
		
		int n = total - 100;
		for(int p=0; p<9; p++) {
			if((double)list.get(p)!=(double)n/2) {
				if(list.contains((n-list.get(p)))){
					list.remove(list.indexOf(n-list.get(p)));
					list.remove(p);
					break;
				}
			}
		}
		for(int p=0; p<7; p++) {
			arr[p]=list.get(p);
		}
		Arrays.sort(arr);
		for(int p=0; p<7; p++) {
			System.out.println(arr[p]);
		}
	}
}